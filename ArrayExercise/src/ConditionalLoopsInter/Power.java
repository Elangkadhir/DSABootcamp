package ConditionalLoopsInter;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double base = in.nextDouble();
        double expo = in.nextDouble();

        System.out.println(Math.pow(base, expo));
    }
}
