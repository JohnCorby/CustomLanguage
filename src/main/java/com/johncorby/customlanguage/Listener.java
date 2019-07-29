package com.johncorby.customlanguage;

import com.johncorby.customlanguage.antlr.GrammarBaseListener;
import com.johncorby.customlanguage.antlr.GrammarParser;
import com.johncorby.customlanguage.element.*;
import org.antlr.v4.runtime.tree.ParseTree;

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
    public void enterFuncCall(GrammarParser.FuncCallContext ctx) {
        String[] args;
        if (ctx.args.children == null) args = new String[0];
        else args = ctx.args.children.stream()
                .filter(parseTree -> parseTree instanceof GrammarParser.ExprContext)
                .map(ParseTree::getText)
                .toArray(String[]::new);
        Element.get(Func.class, ctx.name.getText())
                .call(args);
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

    @Override
    public void enterAsm(GrammarParser.AsmContext ctx) {
        var code = ctx.code.getText();
        code = code.substring(1, code.length() - 1);
        Asm.write(
                "; begin asm",
                code,
                "; end asm"
        );
    }
}
