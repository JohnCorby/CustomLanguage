package com.johncorby.customlanguage;

public class CompileError extends Error {
    public CompileError(String errorMsg) {
        super(errorMsg);
    }
}
