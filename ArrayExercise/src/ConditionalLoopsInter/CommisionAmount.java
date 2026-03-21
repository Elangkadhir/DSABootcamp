package ConditionalLoopsInter;

import java.util.Scanner;

public class CommisionAmount {
    public static void main(String[] args) {
        // Commission Amount = (Sales × Commission %) / 100

        Scanner in = new Scanner(System.in);
        double sales = in.nextDouble();
        double commission = in.nextDouble();

        System.out.println((sales * commission) / 100);

    }
}
