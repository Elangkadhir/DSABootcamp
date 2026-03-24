package ConditionalLoopsInter;

public class SumOfDigits {
    public static void main(String[] args) {
        int num = 123457;
        int sum = 0;
        while (num > 0) {
            int temp = num % 10;
            sum += temp;
            num = num / 10;

        }

        System.out.println(sum);
    }
}
