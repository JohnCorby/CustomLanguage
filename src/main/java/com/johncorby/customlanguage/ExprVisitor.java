package com.johncorby.customlanguage;

import com.johncorby.customlanguage.antlr.GrammarBaseVisitor;

/**
 * handles the reducing of expressions to result registers
 * for example, 1+2 = eax+edx = eax
 */
public class ExprVisitor extends GrammarBaseVisitor<Reg> {
    public static final ExprVisitor EXPR_VISITOR = new ExprVisitor();
}
