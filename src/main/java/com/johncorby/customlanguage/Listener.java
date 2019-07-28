package com.johncorby.customlanguage;

import com.johncorby.customlanguage.antlr.GrammarBaseListener;
import com.johncorby.customlanguage.antlr.GrammarParser;
import com.johncorby.customlanguage.element.ArgVar;
import com.johncorby.customlanguage.element.Element;
import com.johncorby.customlanguage.element.Func;
import com.johncorby.customlanguage.element.StackVar;
import org.antlr.v4.runtime.misc.Pair;

public class Listener extends GrammarBaseListener {
    @Override
    public void enterFuncDeclare(GrammarParser.FuncDeclareContext ctx) {
        new Func(ctx.name.getText());
    }

    @Override
    public void exitFuncDeclare(GrammarParser.FuncDeclareContext ctx) {
        Element.<Func>get(
                new Pair<>("name", ctx.name.getText())
        ).exit();
    }

    @Override
    public void enterVarDeclare(GrammarParser.VarDeclareContext ctx) {
        if (Func.currentFunc != null)
            new StackVar(
                    Func.currentFunc,
                    Type.valueOf(ctx.varType.getText().toUpperCase()),
                    ctx.name.getText()
            );
    }

    @Override
    public void enterFuncArg(GrammarParser.FuncArgContext ctx) {
        new ArgVar(
                Func.currentFunc,
                Type.valueOf(ctx.argType.getText().toUpperCase()),
                ctx.name.getText()
        );
    }
}
