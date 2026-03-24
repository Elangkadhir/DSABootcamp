package ConditionalLoopsInter;

public class NumberPal {
    public static void main(String[] args) {
        int num = 22222;
        int original = num;
        int finala = 0;
        System.out.println(num);

        while (num > 0) {
            int temp = num % 10;
            finala = finala * 10 + temp;
            num = num / 10;
        }

        System.out.println(num);
        System.out.println(original == finala);
    }
}
