package ConditionalLoopsInter;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    // d = \sqrt{(x_2 - x_1)^2 + (y_2 - y_1)^2}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x1 = in.nextInt();
        double x2 = in.nextInt();
        double y1 = in.nextInt();
        double y2 = in.nextInt();

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println(distance);
    }
}
