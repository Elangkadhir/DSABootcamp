public class SumOfN {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }

    static int sum(int a) {
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum += i;
        }
        return sum;
    }
}
