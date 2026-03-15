import java.util.Arrays;

public class ParsingInFunctions {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(nums));
        changeNum(nums);
        System.out.println(Arrays.toString(nums));

    }

    static void changeNum(int[] num) {
        num[0] = 99;
    }
}
