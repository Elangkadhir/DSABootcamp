package ConditionalLoops;

public class Factors {
    public static void main(String[] args) {
        int num = 3;
        int ans = 1;
        for (int i = 1; i <= num; i++) {
            ans *= i;
        }
        System.out.println(ans);
    }
}
