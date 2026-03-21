package ConditionalLoopsInter;

import java.util.Scanner;

public class CalculateElectricBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int unit = in.nextInt();

        if (unit < 100) {
            System.out.println(unit * 1.5);
        } else if (unit > 100 && unit <= 200) {
            System.out.println(unit * 2.5);

        } else if (unit > 200 && unit <= 300) {
            System.out.println(unit *4);
        }
    }
}
