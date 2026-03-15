import java.util.Arrays;
import java.util.Scanner;

public class InputArr {
    public static void main(String[] args) {
        int[] arr = new int[5];
        // arr[0] = 1;
        // arr[1] = 1;
        // arr[2] = 1;
        // arr[3] = 1;
        // arr[4] = 1;

        // System.out.println(arr[3]);
        Scanner in = new Scanner(System.in);
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = in.nextInt();
        // }

        // // for (int i = 0; i < arr.length; i++) {
        // // System.out.print(arr[i] + " ");
        // // }

        // // enhanced for each loop

        // for (int num : arr) {
        // System.out.print(num + " ");
        // }

        // int[] arr2 = {1,2,3,4,5};
        // System.out.println(Arrays.toString(arr2));

        String[] name = { "Helo", "new String" };

        String[] str = new String[4];

        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
        str[1] = "kumal";
        System.out.println(Arrays.toString(str));

    }
}