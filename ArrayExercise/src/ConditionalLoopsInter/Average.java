package ConditionalLoopsInter;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        System.out.println(avg());
    }

    static int avg() {
        Scanner in = new Scanner(System.in);

        int sum = 0;
        int length = 0;

        while (true) {
            int n = in.nextInt();
            if (n == 0) {
                break;
            }
            sum += n;
            length++;
        }

        if (length == 0) {
            System.out.println("No numbers entered");
            return 0;
        }

        return sum / length;
    }
}
