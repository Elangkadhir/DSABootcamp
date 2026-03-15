package com.kadhir;

import java.util.Scanner;

public class Nested {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Fruit Name");

        // String fruit = in.next();
        // if (fruit.equals("Mango")) {
        // System.out.println("King");
        // }
        // if (fruit.equals("Apple")) {
        // System.out.println("red");
        // }
        // if (fruit.equals("Orange")) {
        // System.out.println("65");
        // }

        // switch (fruit) {
        // case "Mango":
        // System.out.println("King");
        // break;
        // case "Apple":
        // System.out.println("red");
        // break;
        // case "orange":
        // System.out.println("65");
        // break;

        // default:
        // System.out.println("Nil");
        // break;
        // }
        int num = in.nextInt();
        // switch (num) {
        // case 1, 2, 3, 4, 5 -> System.out.println("WeekDay");
        // case 6, 7 -> System.out.println("WeekEnd");
        // default -> System.out.println("Valid day");
        // }

        String de = in.next();

        switch (num) {
            case 1:
                System.out.println("Kadhir");
                break;
            case 2:
                System.out.println("Kadhir");
                break;
            case 3:
               switch (de) {
                case "IT":
                    System.out.println("IT De");
                    break;
                case "EEE":
                    System.out.println("EEE De");
                    break;
               
                default:
                    System.out.println("No Department Available");
                    break;
               }
               break;
            default:
                System.out.println("Enter correct num");
                break;
        }
    }

}
