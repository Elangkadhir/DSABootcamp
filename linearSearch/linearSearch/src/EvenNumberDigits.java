public class EvenNumberDigits {
    public static void main(String[] args) {
        int[] nums = { 12, 3445, 22, 6, 7896 };
        System.out.println(digits(22323));
    }

    static int findNumbers(int[] nums) {
        int evenDigits = 0;
        for (int i = 0; i <= nums.length - 1; i++) {
            if (even(nums[i])) {
                evenDigits++;
            }
        }
        return evenDigits;

    }

    static boolean even(int num) {

        int numberOfDigit = digit2(num);

        return numberOfDigit % 2 == 0;
    }

    static int digits(int num) {
        if (num < 0) {
            num = num * -1;
        }
        if (num == 0) {
            return 1;
        }
        int count = 0;

        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    static int digit2(int num) {
        return (int) (Math.log(num)) + 1;
    }
}
