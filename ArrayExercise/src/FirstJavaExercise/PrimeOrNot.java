package FirstJavaExercise;

import java.util.Scanner;

public class PrimeOrNot {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        printPrime(num);
    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        } else {
            int c = 2;
            while (c * c <= num) {
                if (num % c == 0) {
                    return false;
                }
                c += 1;
            }
        }
        return true;
    }

    static void printPrime(int num) {

        for (int i = 0; i <= num; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

    }
}
