package com.johncorby.customlanguage;

import com.johncorby.customlanguage.antlr.GrammarBaseListener;
import com.johncorby.customlanguage.antlr.GrammarParser;
import com.johncorby.customlanguage.element.*;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * handles entering/exiting of antlr rules
 */
public class Listener extends GrammarBaseListener {
    @Override
    public void enterExternFuncDeclare(GrammarParser.ExternFuncDeclareContext ctx) {
        new ExternFunc(ctx.name.getText());
    }

    @Override
    public void enterFuncDeclare(GrammarParser.FuncDeclareContext ctx) {
        new DefinedFunc(ctx.name.getText());
    }

    @Override
    public void exitFuncDeclare(GrammarParser.FuncDeclareContext ctx) {
        Element.get(DefinedFunc.class, ctx.name.getText())
                .exit();
    }

    @Override
    public void enterFuncArg(GrammarParser.FuncArgContext ctx) {
        // only allocate arg if in defined func (not extern func)
        if (DefinedFunc.currentFunc != null)
            new ArgVar(
                    DefinedFunc.currentFunc,
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
        if (DefinedFunc.currentFunc != null)
            new FrameVar(
                    DefinedFunc.currentFunc,
                    Type.get(ctx.varType.getText()),
                    ctx.name.getText()
            );
    }

    @Override
    public void enterVarAssign(GrammarParser.VarAssignContext ctx) {
        Var.get(ctx.name.getText())
                .assign(ctx.val.getText());
    }

    @Override
    public void enterAsm(GrammarParser.AsmContext ctx) {
        var code = ctx.code.getText();
        code = code.substring(1, code.length() - 1);

        // replace format .name with local var equivalent
        // so you can use local vars with asm blocks

        code = Util.replaceMap(code, "\\.([a-zA-Z_][0-9a-zA-Z_]*)",
                m -> Element.get(LocalVar.class, m.group(1)).getAsm());

        Asm.write(
                "; begin asm",
                code,
                "; end asm"
        );
    }
}
