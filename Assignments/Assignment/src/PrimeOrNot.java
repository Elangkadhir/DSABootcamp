import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        isPrime(num);

    }

    static void isPrime(int num) {
        if (num <= 1) {
            System.out.println("Not Prime");
            return;
        }
        int c = 2;
        while (c * c <= num) {
            if (num % c == 0) {
                System.out.println("Not Prime");
                return;
            }
            c++;
        }
        System.out.println("Prime");

    }
}
