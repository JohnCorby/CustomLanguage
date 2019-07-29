package com.johncorby.customlanguage.element;

import com.johncorby.customlanguage.Asm;
import com.johncorby.customlanguage.Type;

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
     * assign this var a value
     */
    public void assign(String value) {
        // TODO more complex values, expr parsing, etc
        Asm.write(String.format("mov %s, %s ; assign var %s", getAsm(), value, name));
    }
}
