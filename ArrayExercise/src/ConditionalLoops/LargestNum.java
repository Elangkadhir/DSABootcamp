package ConditionalLoops;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        System.out.println(max);
        Scanner in = new Scanner(System.in);
        int b = 0;
        while (true) {
            int a = in.nextInt();

            if (a == 0) {
                break;
            }
            if (a > b) {
                b = a;
            }
        }
        System.out.println(b);
    }
}
