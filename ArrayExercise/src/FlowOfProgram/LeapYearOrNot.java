package FlowOfProgram;

import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        check(in.nextInt());
    }

    static void check(int year) {
        if (year % 4 == 0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
    }
}
