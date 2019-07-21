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

        container.stack.add(this);
        this.pos = container.stackPos();

        Asm.write(String.format("mov esp, %s", pos));
    }

    @Override
    public String getAsm() {
        return String.format("[ebp-%d]", pos);
    }

    @Override
    public void undefine() {
        container.stack.remove(this);
        super.undefine();
    }
}
