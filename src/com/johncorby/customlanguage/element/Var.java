package com.johncorby.customlanguage.element;

import com.johncorby.customlanguage.Reg;
import com.johncorby.customlanguage.Type;
import org.antlr.v4.runtime.tree.ParseTree;

import static com.johncorby.customlanguage.ExprVisitor.EXPR_VISITOR;

/**
 * represents any variable
 *
 * todo make offsets and stuff loli
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
     * assign, but when declared
     */
    public abstract void init(ParseTree expr);

    /**
     * assign this var a value
     */
    public void assign(ParseTree expr) {
        Reg.store(EXPR_VISITOR.visit(expr), getAsm());
//        Asm.write(format("mov %s, %s ; assign var %s", getAsm(), EXPR_VISITOR.visit(expr), name));
    }
}
