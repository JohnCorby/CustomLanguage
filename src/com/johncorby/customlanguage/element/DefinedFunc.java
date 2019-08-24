package com.johncorby.customlanguage.element;

import com.johncorby.customlanguage.Asm;

import static com.johncorby.customlanguage.Util.format;

/**
 * a function that you define yourself
 */
public class DefinedFunc extends Func {
    public static DefinedFunc currentFunc;

    public DefinedFunc(String name) {
        super(name);

        // nested funcs are not allowed, so we can just have a global var to represent the func we're currently in
        currentFunc = this;

        Asm.write(
                "global " + name,
                name + ":",
                format("enter 0, 0")
        );
    }

    /**
     * leave the function
     * use this instead of undefine because the function still exists after declaration is done
     */
    public void exit() {
        // delete local vars
        get(LocalVar.class).forEach(Element::undefine);

        currentFunc = null;

        Asm.write(
                "leave",
                "ret"
        );
    }
}
