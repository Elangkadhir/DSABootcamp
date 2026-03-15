public class Factorial {
    public static void main(String[] args) {
        fac(7);
    }

    static void fac(int i) {
        int fact = 1;

        while (i >= 1) {
            fact = fact * i;
            i--;
        }

        System.out.println(fact);
    }

}