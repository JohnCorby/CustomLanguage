package com.johncorby.customlanguage.element;

import com.johncorby.customlanguage.Type;

/**
 * func argument/parameter
 */
public class ArgVar extends LocalVar {
    public ArgVar(Type type, String name) {
        super(type, name);
    }

    @Override
    public int initOfs() {
        return (1 + get(ArgVar.class).size()) * 4;
    }
}
