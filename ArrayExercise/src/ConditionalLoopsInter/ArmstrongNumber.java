package ConditionalLoopsInter;

public class ArmstrongNumber {
    public static void main(String[] args) {

        for (int i = 10; i <= 999; i++) {
            if (isArm(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isArm(int num) {
        int original = num;
        int temp = 0;
        while (num > 0) {
            int val = num % 10;
            temp = temp + (val * val * val);
            num = num / 10;
        }
        return original == temp;
    }
}
