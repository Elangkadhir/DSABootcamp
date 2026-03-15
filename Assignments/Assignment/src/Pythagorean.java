public class Pythagorean {
    public static void main(String[] args) {
        System.out.println(trip(12, 5, 13));
    }

    static boolean trip(int a, int b, int c) {

        int x = Math.min(a, Math.min(b, c));
        int z = Math.max(a, Math.max(b, c));
        int y = a + b + c - z - x;

        return x * x + y * y == z * z;

    }
}
