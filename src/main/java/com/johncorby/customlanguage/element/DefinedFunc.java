package com.johncorby.customlanguage.element;

import com.johncorby.customlanguage.Asm;

import java.util.HashSet;
import java.util.Set;

/**
 * a function that you define yourself
 */
public class DefinedFunc extends Func {
    public static DefinedFunc currentFunc;

    public final Set<LocalVar> vars = new HashSet<>();

    public DefinedFunc(String name) {
        super(name);

        // nested funcs are not allowed, so we can just have a global var to represent the func we're currently in
        currentFunc = this;

        Asm.write(
                "; begin func " + name,
                "global " + name,
                name + ":",
                "enter 0, 0"
        );
    }

    /**
     * leave the function
     * use this instead of undefine because the function still exists after declaration is done
     */
    public void exit() {
        // delete local vars
        // since undefine removes element from set, iterate over COPY of set to avoid exception
        new HashSet<>(vars).forEach(LocalVar::undefine);

        currentFunc = null;

        Asm.write(
                "leave",
                "ret",
                "; end func " + name
        );
    }
}
