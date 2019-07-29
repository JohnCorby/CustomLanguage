package com.johncorby.customlanguage;

import org.apache.commons.lang3.builder.MultilineRecursiveToStringStyle;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.io.IOException;
import java.util.Arrays;

public class Util {
    /**
     * convert any object to a string
     */
    public static String toString(Object obj) {
        if (obj instanceof Object[])
            return Arrays.deepToString((Object[]) obj);
        return String.valueOf(obj);
    }

    public static String toString2(Object obj) {
        return ReflectionToStringBuilder.toString(obj, new MultilineRecursiveToStringStyle());
    }

    /**
     * python-like print format
     */
    public static String format(Object... args) {
        StringBuilder msg = new StringBuilder();
        for (var arg : args)
            msg.append(toString(arg)).append(' ');
        return msg.toString();
    }

    /**
     * python-like print
     */
    public static void print(Object... args) {
        System.out.println(format(args));
    }

    /**
     * exec command as process
     */
    public static int do_cmd(String... args) {
        try {
            return new ProcessBuilder(args)
                    .inheritIO()
                    .start()
                    .waitFor();
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
            return -1;
        }
    }

    /**
     * change extension of file name
     */
    public static String change_ext(String file, String ext) {
        return file.substring(0, file.lastIndexOf('.')) + ext;
    }

    /**
     * assert but raise {@link CompileError} instead of {@link AssertionError}
     */
    public static void cassert(boolean condition, String errorMsg) {
        if (!condition) throw new CompileError(errorMsg);
    }
}
