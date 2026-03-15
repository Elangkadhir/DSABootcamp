package com.kadhir;

import java.util.Scanner;

public class Calcu {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;

        while (true) {

            System.out.println("Enter Operator");
            char op = in.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.println("Enter Two numbers");

                int a = in.nextInt();
                int b = in.nextInt();
                if (op == '+') {
                    ans = a + b;
                } else if (op == '-') {
                    ans = a - b;
                } else if (op == '*') {
                    ans = a * b;
                } else if (op == '/') {
                    if (b != 0) {
                        ans = a / b;

                    }
                } else if (op == '%') {
                    ans = a % b;
                } else {
                    System.out.println("Enter a valid Operator");
                }
            } else if (op == 'x' || op == 'X') {
                System.out.println("Operation Ended");
                break;
            }

            System.out.println("the answer is : " + ans);
        }

    }
}