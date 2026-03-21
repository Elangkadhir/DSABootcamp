package ConditionalLoopsInter;

import java.util.Scanner;

public class Compound {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double p = in.nextDouble();
        double r = in.nextDouble();
        double t = in.nextDouble();

        System.out.println((p * Math.pow((1 + (r / 100)), t)) - p);
    }
}
