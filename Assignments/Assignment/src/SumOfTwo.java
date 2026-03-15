import java.util.Scanner;

public class SumOfTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Two numbers : ");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(sum(a, b));
        System.out.println(prod(a, b));
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int prod(int a, int b) {
        return a * b;
    }
}
