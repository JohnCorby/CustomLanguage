package com.johncorby.customlanguage.element;

import com.johncorby.customlanguage.Type;

/**
 * global variable (not contained in a function)
 * todo eventually implement
 */
public class GlobalVar extends Var {
    public GlobalVar(Type type, String name) {
        super(type, name);
    }

    @Override
    public String getAsm() {
        return null;
    }
}
