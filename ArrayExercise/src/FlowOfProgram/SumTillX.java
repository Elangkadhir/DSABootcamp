package FlowOfProgram;

import java.util.Scanner;

public class SumTillX {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter number (or x to stop): ");
        while (true) {

            String input = in.next();

            if (input.equalsIgnoreCase("x")) {
                break;
            }

            int num = Integer.parseInt(input);
            sum += num;
        }

        System.out.println("Sum = " + sum);
    }
}