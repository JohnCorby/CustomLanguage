package com.johncorby.customlanguage.element;

import com.johncorby.customlanguage.Asm;

import java.util.HashSet;
import java.util.Set;

/**
 * represents a function with a stack frame
 */
public class Func extends Element {
    public static Func currentFunc;

    public final Set<StackVar> stack = new HashSet<>();
    public final Set<ArgVar> args = new HashSet<>();

    public Func(String name) {
        super(name);

        // nested funcs are not allowed, so we can just have a global var to represent the func we're currently in
        currentFunc = this;

        // prologue
        Asm.write(
                "; begin func " + name,
                "global " + name,
                name + ":",
                "; prologue",
                "push ebp",
                "mov ebp, esp",
                "; body"
        );
    }

    @Override
    public String getAsm() {
        return name;
    }

    /**
     * current local variable offset (ebp-this)
     */
    public int stackPos() {
        int stackPos = 0;
        for (var var : stack)
            stackPos += var.type.size;
        return stackPos;
    }

    /**
     * current func arg variable offset (ebp+this)
     */
    public int argPos() {
        return 4 * (args.size() + 2);
    }

    public void exit() {
        args.forEach(ArgVar::undefine);
        stack.forEach(StackVar::undefine);

        currentFunc = null;

        Asm.write(
                "; epilogue",
                "mov esp, ebp",
                "pop ebp",
                "ret",
                "; end func"
        );
    }
}
