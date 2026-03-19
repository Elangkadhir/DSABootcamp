package ConditionalLoops;

import java.util.Scanner;

public class SumOfAll {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int b = 0;
        while (true) {
            int a = in.nextInt();
            if (a == 0) {
                break;
            }
            b += a;
        }
        System.out.println(b);
    }
}
