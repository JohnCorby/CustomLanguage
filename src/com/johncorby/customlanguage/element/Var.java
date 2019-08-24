package com.johncorby.customlanguage.element;

import com.johncorby.customlanguage.Reg;
import com.johncorby.customlanguage.Type;
import org.antlr.v4.runtime.tree.ParseTree;

import static com.johncorby.customlanguage.ExprVisitor.EXPR_VISITOR;
import static com.johncorby.customlanguage.Util.format;

/**
 * represents any variable
 * <p>
 * todo make offsets and stuff loli
 */
public abstract class Var extends Element {
    public final Type type;
    public final int ofs;

    public Var(Type type, String name) {
        super(name);
        this.type = type;
        ofs = initOfs();
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

    @Override
    public String getAsm() {
        return format(
                "%s [%s%s%s]",
                type.sizeOperand(),
                getOfsBase(),
                ofs > 0 ? "+" : "-",
                Math.abs(ofs)
        );
    }

    public abstract void init(ParseTree expr);

    public void assign(ParseTree expr) {
        Reg.store(EXPR_VISITOR.visit(expr), getAsm());
    }

    public abstract String getOfsBase();

    public abstract int initOfs();
}
