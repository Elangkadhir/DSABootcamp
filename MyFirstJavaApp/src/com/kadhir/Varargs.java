package com.kadhir;

import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {
        fun(2, 2, 2, 2, 2, 2, 2, 2, 222, 2, 2, 2);
    
    }

    static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }

    static void fun(int a, int b, String... v) {

    }
}
