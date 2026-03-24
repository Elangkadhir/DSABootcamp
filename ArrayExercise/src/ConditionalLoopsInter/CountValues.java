package ConditionalLoopsInter;

import java.util.Scanner;

public class CountValues {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int negativeNumbers = 0;
        int positiveEvenNumbers = 0;
        int positiveOddNumbers = 0;

        while (true) {
            int num = in.nextInt();
            if (num == 0) {
                break;
            } else {
                if (num < 0) {
                    negativeNumbers += num;
                } else if (num % 2 == 0) {
                    positiveEvenNumbers += num;
                } else {
                    positiveOddNumbers += num;
                }
            }
        }

        System.out.println("negativeNumbers " + negativeNumbers);
        System.out.println("positiveEvenNumbers " + positiveEvenNumbers);
        System.out.println("positiveOddNumbers " + positiveOddNumbers);
    }
}