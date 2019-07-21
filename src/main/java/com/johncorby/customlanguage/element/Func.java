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

        currentFunc = this;

        Asm.write(
                String.format("%s:", name),
                "push ebp",
                "mov ebp, esp"
        );
    }

    @Override
    public String getAsm() {
        return name;
    }

    public int stackPos() {
        int stackPos = 0;
        for (var var : stack)
            stackPos += var.type.size;
        return stackPos;
    }

    public int argPos() {
        return 4 * (args.size() + 2);
    }

    public void exit() {
        currentFunc = null;

        Asm.write(
                "mov esp, ebp",
                "pop ebp",
                "ret"
        );
    }
}
