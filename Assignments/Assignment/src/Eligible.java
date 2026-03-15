public class Eligible {
    public static void main(String[] args) {
        isEligible(17);
    }

    static void isEligible(int num) {
        if (num >= 18) {
            System.out.println("Eligible");

        } else {
            System.out.println("Not Eligible");
        }
    }
}
