package com.johncorby.customlanguage;

import com.johncorby.customlanguage.antlr.GrammarBaseListener;
import com.johncorby.customlanguage.antlr.GrammarParser;
import com.johncorby.customlanguage.element.*;

public class Listener extends GrammarBaseListener {
    @Override
    public void enterFuncDeclare(GrammarParser.FuncDeclareContext ctx) {
        new Func(ctx.name.getText());
    }

    @Override
    public void exitFuncDeclare(GrammarParser.FuncDeclareContext ctx) {
        Element.get(Func.class, ctx.name.getText())
                .exit();
    }

    @Override
    public void enterFuncArg(GrammarParser.FuncArgContext ctx) {
        new ArgVar(
                Func.currentFunc,
                Type.get(ctx.argType.getText()),
                ctx.name.getText()
        );
    }

    @Override
    public void enterVarDeclare(GrammarParser.VarDeclareContext ctx) {
        // local var
        if (Func.currentFunc != null)
            new StackVar(
                    Func.currentFunc,
                    Type.get(ctx.varType.getText()),
                    ctx.name.getText()
            );
    }

    @Override
    public void enterVarAssign(GrammarParser.VarAssignContext ctx) {
        Element.get(Var.class, ctx.name.getText())
                .assign(ctx.val.getText());
    }
}
