package com.johncorby.customlanguage.element;

import com.johncorby.customlanguage.Asm;
import com.johncorby.customlanguage.Type;

/**
 * func local variable
 */
public class StackVar extends Var {
    public final Func container;
    public final int pos;

    public StackVar(Func container, Type type, String name) {
        super(type, name);
        this.container = container;

        container.locals.add(this);
        this.pos = container.localPos();

        // allocate space on declare
        // instead of all at once during func prologue cuz that's harder lol
        Asm.write(String.format("sub esp, %s ; declare var %s", type.size, name));
    }

    @Override
    public String getAsm() {
        return String.format("%s [ebp-%s]", type, pos);
    }

    @Override
    public void undefine() {
        container.locals.remove(this);
        super.undefine();
    }
}
