package com.kadhir;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int num = input.nextInt();
        // if (num % 2 == 0) {
        // System.out.println(num + " is an even number.");
        // } else {
        // System.out.println(num + " is an odd number.");
        // }

        // System.out.println("Enter Your Name: ");
        // String name = input.nextLine();
        // System.out.println("Hello " + name + "!");

        // System.out.println("Enter Value in the order of P T R");
        // double p = input.nextDouble();
        // double t = input.nextDouble();
        // double r = input.nextDouble();
        // double simpleInterest = (p * t * r) / 100;
        // System.out.println("Simple Interest: " + simpleInterest);

        // System.out.println("Ebter Two Numbers ");
        // int num1 = input.nextInt();
        // int num2 = input.nextInt();

        // System.out.println("Enter the operator (+, -, *, /): ");
        // char operator = input.next().charAt(0);
        // double result = 0;
        // boolean validOperator = true;

        // switch (operator) {
        // case '+':
        // result = num1 + num2;
        // break;
        // case '-':
        // result = num1 - num2;
        // break;
        // case '*':
        // result = num1 * num2;
        // break;
        // case '/':
        // if (num2 != 0) {
        // result = (double) num1 / num2;
        // } else {
        // System.out.println("Error: Division by zero is not allowed.");
        // validOperator = false;
        // }
        // break;
        // default:
        // System.out.println("Error: Invalid operator.");
        // validOperator = false;
        // }

        // if (validOperator) {
        // System.out.println("Result: " + result);
        // }

        System.out.println("Ebter Two Numbers ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else if (num1 < num2) {
            System.out.println(num2 + " is greater than " + num1);
        } else {
            System.out.println("Both numbers are equal.");
        }
    }
}
