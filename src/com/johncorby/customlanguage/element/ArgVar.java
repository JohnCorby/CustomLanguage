package com.johncorby.customlanguage.element;

import com.johncorby.customlanguage.Type;

import java.util.stream.Collectors;

/**
 * func argument/parameter
 */
public class ArgVar extends LocalVar {
    public ArgVar(Type type, String name) {
        super(type, name);
    }

    @Override
    public int initPos() {
        var args = parent.vars.stream()
                .filter(v -> v instanceof ArgVar)
                .collect(Collectors.toSet());
        return (1 + args.size()) * 4;
    }
}
