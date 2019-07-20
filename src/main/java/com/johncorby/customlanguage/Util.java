package com.johncorby.customlanguage;

import java.io.IOException;
import java.util.Arrays;

public class Util {
    /**
     * convert any object to a string
     */
    public static String stringify(Object obj) {
        if (obj instanceof Object[])
            return Arrays.deepToString((Object[]) obj);
        return String.valueOf(obj);
    }

    /**
     * python-like print
     */
    public static void print(Object... args) {
        StringBuilder msg = new StringBuilder();
        for (var arg : args)
            msg.append(stringify(arg)).append(" ");
        System.out.println(msg.toString());
    }

    /**
     * exec command as process
     */
    public static int do_cmd(String... args) {
        try {
            return Runtime.getRuntime().exec(args).waitFor();
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
            return -1;
        }
    }
}
