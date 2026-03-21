package ConditionalLoopsInter;

import java.util.Scanner;

public class CalculateDepreciation {
    public static void main(String[] args) {
        // Depreciation = (Original Value × Rate × Time) / 100
        // Final Value = Original Value - Depreciation

        Scanner in = new Scanner(System.in);
        double org = in.nextDouble();
        double rate = in.nextDouble();
        double time = in.nextDouble();

        double depre = (org * rate * time) / 100;
        System.out.println(org - depre);
    }
}
