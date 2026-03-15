import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        checkNum(num);
    }

    static void checkNum(int a) {
        if (a % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
