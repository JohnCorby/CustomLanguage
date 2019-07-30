package com.johncorby.customlanguage.element;

import com.johncorby.customlanguage.Asm;

import java.util.HashSet;
import java.util.Set;

/**
 * represents a function with a stack frame
 * uses c calling convention
 */
public class Func extends Element {
    public static Func currentFunc;

    public final Set<LocalVar> vars = new HashSet<>();

    public Func(String name) {
        super(name);

        // nested funcs are not allowed, so we can just have a global var to represent the func we're currently in
        currentFunc = this;

        Asm.write(
                "; begin func " + name,
                "global " + name,
                name + ":",
                "push ebp",
                "mov ebp, esp"
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
                "mov esp, ebp",
                "pop ebp",
                "ret",
                "; end func " + name
        );
    }

    @Override
    public String getAsm() {
        return name;
    }

    /**
     * call this function with args
     * todo function signatures and stuff
     */
    public void call(String... args) {
        // push args (right to left)
        for (var i = args.length - 1; i >= 0; i--)
            Asm.write(String.format("push %s ; arg %s", args[i], i + 1));

        Asm.write("call " + getAsm());

        // clean stack
        if (args.length > 0) Asm.write("add esp, " + args.length * 4);
    }
}
