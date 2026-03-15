package com.kadhir;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int n = in.nextInt();
        // boolean ans = isAmstrong(153);
        // System.out.println(ans);
        arm();
    }

    // print all the 3digit armstrong number
    static boolean isAmstrong(int n) {
        int sum = 0;
        int original = n;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem * rem * rem;
            n = n / 10;
        }

        return sum == original;
    }

    // print all armstrong number under 3 digits

    static void arm() {
        for (int i = 100; i <= 1000; i++) {
            if (isAmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > n;
    }
}
