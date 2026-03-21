package ConditionalLoopsInter;

import java.util.Scanner;

public class BattingAvg {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double totalRuns = in.nextDouble();
        double timeOut = in.nextDouble();

        System.out.println(totalRuns / timeOut);
    }
}
