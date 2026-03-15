package com.kadhir;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a : " + a + " b : " + b);
        String name = "Kadhir";
        System.out.println(name);
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
