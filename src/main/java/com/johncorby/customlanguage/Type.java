package com.johncorby.customlanguage;

public enum Type {
    BYTE(1),
    WORD(2),
    DWORD(4);

    public final int size;

    Type(int size) {
        this.size = size;
    }

    public static Type get(String name) {
        return valueOf(name.toUpperCase());
    }
}
