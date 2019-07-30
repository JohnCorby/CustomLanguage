package com.johncorby.customlanguage.element;

import com.johncorby.customlanguage.Type;

import java.util.Objects;

/**
 * variable contained in a function
 */
public abstract class LocalVar extends Var {
    public final Func parent;
    public final int pos;

    public LocalVar(Func parent, Type type, String name) {
        super(type, name);
        this.parent = parent;

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
        return String.format(
                pos < 0 ? "%s [ebp-%s]" : "%s [ebp+%s]",
                type.sizeOperand(),
                pos
        );
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
