package FirstJavaExercise;

public class ArmstrongNum {

    public static void main(String[] args) {

        // isArm(153);

        for (int index = 100; index <= 999; index++) {
            if (isArm(index)) {
                System.out.println(index + " ");
            }
        }

    }

    static boolean isArm(int num) {
        int original = num;
        int c = 0;
        while (num > 0) {
            int temp = (num % 10);
            c = c + (temp * temp * temp);
            num = num / 10;
        }
        return original == c;
    }
}
