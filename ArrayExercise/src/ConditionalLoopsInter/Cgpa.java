package ConditionalLoopsInter;

import java.util.Scanner;

public class Cgpa {
    public static void main(String[] args) {
        int total = 0;
        int n = 0;

        Scanner in = new Scanner(System.in);
        while (true) {
            int mark = in.nextInt();

            if (mark == 0) {
                break;
            } else {
                total += mark;
                n++;
            }

        }

        if (n == 0) {
            System.out.println("No data entered");
        } else {
            double cgpa = (double) total / n; 
            System.out.println("CGPA: " + cgpa);
        }
    }

}
