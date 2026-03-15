public class PrimeBetweenTwo {

    public static void main(String[] args) {
        printPrime(1, 100);
    }

    static boolean isPrimeOrNot(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    static void printPrime(int a, int b) {
        int c = 0;
        for (int i = a; i <= b; i++) {
            if (isPrimeOrNot(i)) {
                System.out.print(i + " ");
                c++;
            }

        }            
        System.out.println( " ");
        System.out.println(c + " ");

    }
}