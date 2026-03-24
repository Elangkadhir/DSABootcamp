package ConditionalLoopsInter;

import java.util.Scanner;

public class NprCpr {
    // nPr = n! / (n - r)!
    // nCr = n! / (r! * (n - r)!)

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int r = in.nextInt();

        int n_fact = factor(n);
        int r_fact = factor(r);

        System.out.println("NPR " + (n_fact / (factor(n - r))));
        System.out.println("NCR " + (n_fact / (r_fact * factor(n - r))));

    }

    static int factor(int num) {
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        return fact;

    }
}
