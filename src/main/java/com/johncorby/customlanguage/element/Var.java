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
    public void assign(String value) {
        // TODO more complex values, expr parsing, etc
        // TODO variables
        Asm.write(String.format("mov %s, %s ; assign var %s", getAsm(), value, name));
    }
}
