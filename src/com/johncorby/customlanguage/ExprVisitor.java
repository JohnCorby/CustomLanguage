package com.johncorby.customlanguage;

import com.johncorby.customlanguage.antlr.GrammarBaseVisitor;
import com.johncorby.customlanguage.antlr.GrammarParser;

import static com.johncorby.customlanguage.Listener.LISTENER;

/**
 * handles the reducing of expressions to result registers
 * for example, 1+2 = eax+edx = eax
 */
public class ExprVisitor extends GrammarBaseVisitor<Reg> {
    public static final ExprVisitor EXPR_VISITOR = new ExprVisitor();

    @Override
    public Reg visitParenExpr(GrammarParser.ParenExprContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Reg visitMulDivExpr(GrammarParser.MulDivExprContext ctx) {
        switch (ctx.op.getText()) {
            case "*":
                return Reg.mul(visit(ctx.left), visit(ctx.right));
            default:
                return null;
        }
    }

    @Override
    public Reg visitAddSubExpr(GrammarParser.AddSubExprContext ctx) {
        switch (ctx.op.getText()) {
            case "+":
                return Reg.add(visit(ctx.left), visit(ctx.right));
            default:
                return null;
        }
    }

    @Override
    public Reg visitFuncExpr(GrammarParser.FuncExprContext ctx) {
        LISTENER.enterFuncCall(ctx.funcCall());
        return Reg.EAX;
    }

    @Override
    public Reg visitIdExpr(GrammarParser.IdExprContext ctx) {
        return Reg.load(ctx.IDENT().getText());
    }

    @Override
    public Reg visitIntExpr(GrammarParser.IntExprContext ctx) {
        return Reg.load(ctx.INT_LITERAL().getText());
    }
}
