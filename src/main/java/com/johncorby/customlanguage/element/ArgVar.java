package com.johncorby.customlanguage.element;

import com.johncorby.customlanguage.Type;

/**
 * func parameter variable
 */
public class ArgVar extends Var {
    public final Func container;
    public final int pos;

    public ArgVar(Func container, Type type, String name) {
        super(type, name);
        this.container = container;

        container.args.add(this);
        this.pos = container.argPos();
    }

    @Override
    public String getAsm() {
        return String.format("%s [ebp+%s]", type, pos);
    }

    @Override
    public void undefine() {
        container.args.remove(this);
        super.undefine();
    }
}
