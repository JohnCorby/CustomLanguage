package com.johncorby.customlanguage.element;

import com.johncorby.customlanguage.Asm;
import com.johncorby.customlanguage.Type;
import com.johncorby.customlanguage.antlr.GrammarParser;

import static com.johncorby.customlanguage.ExprVisitor.EXPR_VISITOR;
import static com.johncorby.customlanguage.Util.format;

/**
 * represents any variable
 */
public abstract class Var extends Element {
    public final Type type;

    public Var(Type type, String name) {
        super(name);
        this.type = type;
    }

    /**
     * get variable by name
     * allows overloading global var with local var
     */
    public static Var get(String name) {
        // first, try getting local var
        var local = get(LocalVar.class, name);
        if (local != null) return local;

        // then, try getting global var
        return get(GlobalVar.class, name);
    }

    /**
     * assign this var a value
     */
    public void assign(GrammarParser.ExprContext expr) {
        // TODO more complex values, expr parsing, etc
        // TODO variables
        Asm.write(format("mov %s, %s ; assign var %s", getAsm(), EXPR_VISITOR.visit(expr), getAsm()));
    }
}
