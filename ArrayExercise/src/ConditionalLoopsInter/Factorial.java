package ConditionalLoopsInter;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        factorial(num);
    }

    static void factorial(int num) {
        int ans = 1;
        for (int i = 1; i <= num; i++) {
            ans = ans * i;
        }
        System.out.println(ans);
    }
}