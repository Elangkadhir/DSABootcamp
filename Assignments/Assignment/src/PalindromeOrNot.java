public class PalindromeOrNot {

    public static void main(String[] args) {
        System.out.println(pal(121)); // true
        System.out.println(pal(123)); // false
    }

    static boolean pal(int num) {

        int original = num;
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        return original == reverse;
    }
}