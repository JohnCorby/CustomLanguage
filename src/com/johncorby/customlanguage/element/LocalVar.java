package com.johncorby.customlanguage.element;

import com.johncorby.customlanguage.Type;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Objects;

import static com.johncorby.customlanguage.Util.format;

/**
 * variable contained in a function
 */
public abstract class LocalVar extends Var {
    public final DefinedFunc parent;
    public final int pos;

    public LocalVar(Type type, String name) {
        super(type, name);
        this.parent = DefinedFunc.currentFunc;

        parent.vars.add(this);
        this.pos = initPos();
    }

    @Override
    public void undefine() {
        parent.vars.remove(this);
        super.undefine();
    }

    /**
     * initialize pos (ebp offset) from parent
     */
    public abstract int initPos();

    @Override
    public String getAsm() {
        return format(
                pos < 0 ? "%s [ebp-%s]" : "%s [ebp+%s]",
                type.sizeOperand(),
                Math.abs(pos)
        );
    }

    @Override
    public void init(ParseTree expr) {
        if (expr == null) return;
        assign(expr);
    }

    /**
     * check against INSTANCE match instead of exact CLASS match
     * makes sure can't have different subclasses of same name
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LocalVar)) return false;
        Element element = (Element) o;
        return Objects.equals(name, element.name);
    }
}
