public class FunctionPractice {
    public static void main(String[] args) {
        System.out.println("Hello world");
        bigAndSmall(1111, 2212, 311121222);
    }

    static void bigAndSmall(int a, int b, int c) {
        int big = a;
        int small = a;

        if (b > big) {
            big = b;
        }
        if (c > big) {
            big = c;
        }

        if (b < small) {
            small = b;
        }
        if (c < small) {
            small = c;
        }

        System.out.println("Big : " + big);
        System.out.println("Small : " + small);
    }
}