package com.kadhir;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        {
            // int a =10;
            // reinitialise is not posiible but reassigning is possible
            a = 90;
            int c = 20;
            // values initialised in this block remain in this block
        }
        System.out.println(a);
        // System.out.println(num);
    }

    static void random(int marks) {
        int num = 67;
        System.out.println(num);
    }
}
