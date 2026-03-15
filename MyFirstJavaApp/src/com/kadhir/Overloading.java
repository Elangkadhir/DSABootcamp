package com.kadhir;

public class Overloading {
    public static void main(String[] args) {
        fun(67);
        fun("Kadhir");

        // which funtion to call will be decided in compile time
    }

    static void fun(int a) {
        System.out.println(a);

    }

    static void fun(String name) {
        System.out.println(name);
    }
}
