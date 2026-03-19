package ConditionalLoops;

import java.util.Scanner;

public class AdditionOfTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        sum(a,b);
    }

    static void sum(int a, int b) {
        System.out.println(a + b);
    }
}