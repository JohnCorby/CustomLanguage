package com.johncorby.customlanguage;

import com.johncorby.customlanguage.antlr.GrammarBaseListener;
import com.johncorby.customlanguage.antlr.GrammarParser;
import com.johncorby.customlanguage.element.*;

/**
 * handles entering/exiting of antlr rules
 */
public class Listener extends GrammarBaseListener {
    public static final Listener LISTENER = new Listener();

    @Override
    public void enterExternFuncDeclare(GrammarParser.ExternFuncDeclareContext ctx) {
        new ExternFunc(ctx.name.getText());
    }

    @Override
    public void enterFuncDeclare(GrammarParser.FuncDeclareContext ctx) {
        new DefinedFunc(ctx.name.getText());
    }

    @Override
    public void enterFuncArg(GrammarParser.FuncArgContext ctx) {
        // only allocate arg if in defined func (not extern func)
        if (DefinedFunc.currentFunc != null)
            new ArgVar(
                    Type.get(ctx.argType.getText()),
                    ctx.name.getText()
            );
    }

    @Override
    public void exitFuncDeclare(GrammarParser.FuncDeclareContext ctx) {
        Element.get(DefinedFunc.class, ctx.name.getText()).exit();
    }

    @Override
    public void enterFuncCall(GrammarParser.FuncCallContext ctx) {
        Element.get(Func.class, ctx.name.getText()).call(ctx.args.children);
    }

    @Override
    public void enterVarDeclare(GrammarParser.VarDeclareContext ctx) {
        var type = Type.get(ctx.varType.getText());
        var name = ctx.name.getText();

        // local vs global
        var var = DefinedFunc.currentFunc != null ?
                new FrameVar(type, name) :
                new GlobalVar(type, name);

        // optional initialize
        var.init(ctx.val);
    }

    @Override
    public void enterVarAssign(GrammarParser.VarAssignContext ctx) {
        Var.get(ctx.name.getText()).assign(ctx.val);
    }

    @Override
    public void enterAsm(GrammarParser.AsmContext ctx) {
        var code = ctx.code.getText();
        code = code.substring(1, code.length() - 1);

        // replace format .name with local var equivalent
        // so you can use local vars with asm blocks
        // todo use #define here instead and offset etc etc

//        code = Util.replaceMap(code, "\\.([a-zA-Z_][0-9a-zA-Z_]*)",
//                m -> Element.get(LocalVar.class, m.group(1)).getAsm());

        Asm.write(code);
    }
}
