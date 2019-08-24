package com.johncorby.customlanguage.element;

import com.johncorby.customlanguage.Type;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Objects;

/**
 * variable contained in a function
 */
public abstract class LocalVar extends Var {
    public LocalVar(Type type, String name) {
        super(type, name);
    }

    @Override
    public void init(ParseTree expr) {
        if (expr == null) return;
        assign(expr);
    }

    @Override
    public String getOfsBase() {
        return "ebp";
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
