import java.util.Scanner;

public class MultiDimensionArray {
    public static void main(String[] args) {

        int[][] num = new int[3][];
        int[][] num2 = new int[3][2];

        int[][] arr = {
                { 12, 23, 233 },
                { 122, 2, 3, 4, 5 }
        };

        Scanner in = new Scanner(System.in);
        int[][] arr2d = new int[3][3];

        for (int row = 0; row < arr2d.length; row++) {
            for (int col = 0; col < arr2d[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

    }
}
