import java.util.Arrays;

public class SearchIn2dArray {

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9, 99, -11 } };
        int target = 9;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
        System.out.println(min(arr));
    }

    static int[] search(int arr[][], int target) {
        if (arr.length == 0) {
            return new int[] { 0, 0 };

        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (target == arr[row][col]) {
                    return new int[] { row, col };
                }
            }
        }
        return new int[] { 0, 0 };
    }

    static int max(int arr[][]) {
        if (arr.length == 0) {
            return -1;

        }
        int max = arr[0][0];
        for (int[] arr1 : arr) {
            for (int element : arr1) {
                if (max < element) {
                    max = element;
                }
            }
        }
        return max;
    }

    static int min(int arr[][]) {
        if (arr.length == 0) {
            return -1;

        }
        int min = arr[0][0];

        for (int[] row : arr) {
            for (int col : row) {
                if (col < min) {
                    min = col;
                }
            }
        }

        return min;
    }
}
