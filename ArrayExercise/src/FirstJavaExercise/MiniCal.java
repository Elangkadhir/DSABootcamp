package FirstJavaExercise;

import java.util.Scanner;

public class MiniCal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        String op = in.next();

        if (op.equals("/") && b == 0) {
            System.out.println("Cannot divide by zero");
        }

        switch (op) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(a / b);
                break;
            case "%":
                System.out.println(a % b);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
