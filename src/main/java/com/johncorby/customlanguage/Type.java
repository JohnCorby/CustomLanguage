package com.johncorby.customlanguage;

public enum Type {
    INT(4);

    public final int size;

    Type(int size) {
        this.size = size;
    }
}
