package com.johncorby.customlanguage.element;

import com.johncorby.customlanguage.Asm;
import com.johncorby.customlanguage.Reg;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;
import java.util.Objects;

import static com.johncorby.customlanguage.ExprVisitor.EXPR_VISITOR;
import static com.johncorby.customlanguage.Util.format;

/**
 * represents any function
 * uses c calling convention
 */
public abstract class Func extends Element {
    // todo signature (ret and arg types)

    public Func(String name) {
        super(name);
    }

    @Override
    public String getAsm() {
        return name;
    }

    /**
     * call this function with args
     * todo function signatures and stuff
     */
    public void call(List<ParseTree> exprs) {
        // get registers
        var args = exprs.stream()
                .map(EXPR_VISITOR::visit)
                .toArray(Reg[]::new);

        // push args (right to left)
        for (var i = args.length - 1; i >= 0; i--)
            Asm.write(format("push %s ; arg %s", args[i], i + 1));

        Asm.write("call " + getAsm());

        // clean stack
        if (args.length > 0) Asm.write("add esp, " + args.length * 4);
    }

    /**
     * prevent subclasses of same name
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Func)) return false;
        Element element = (Element) o;
        return Objects.equals(name, element.name);
    }
}
