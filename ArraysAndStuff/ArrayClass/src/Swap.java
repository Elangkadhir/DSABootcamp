import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 23, 9, 18,56 };
        // swap(arr, 1, 4);
        // System.out.println(Arrays.toString(arr));
        // max(arr);
        // max(arr,3,4);

        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }

    static void max(int[] arr) {
        int big = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > big) {
                big = arr[i];
            }
        }
        System.out.println(big);
    }

    static void max(int[] arr, int start, int end) {
        int big = arr[0];
        for (int i = start; i <= end; i++) {
            if (arr[i] > big) {
                big = arr[i];
            }
        }
        System.out.println(big);
    }
}
