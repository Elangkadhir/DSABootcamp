package com.kadhir;

public class Sum {
    public static void main(String[] args) {

        int sumans = sum(12, 15);
        System.out.println(sumans);
        sout();
        System.out.println(greeting("Kadhir "));
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static void sout() {
        System.out.println("Hello");
    }

    static String greeting(String a) {
        return a + "Hello ";
    }
}
