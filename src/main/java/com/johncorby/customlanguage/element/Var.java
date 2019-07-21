package com.johncorby.customlanguage.element;

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
}
