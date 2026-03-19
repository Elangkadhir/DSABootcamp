package ConditionalLoops;

public class Prodandsum {
    // q.22

    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
    }

    static int subtractProductAndSum(int n) {
        int sum = 0;
        int pr = 1;

        while (n > 0) {
            int temp = n % 10;
            sum += temp;
            pr *= temp;
            n = n / 10;
        }
        return pr - sum;
    }
}
