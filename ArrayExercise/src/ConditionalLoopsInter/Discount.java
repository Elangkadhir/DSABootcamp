package ConditionalLoopsInter;

public class Discount {
    public static void main(String[] args) {
        System.out.println(calculateDiscount(1200, 10));
        ;
    }

    static double calculateDiscount(int price, int dp) {
        double discountAmount = (price * dp) / 100;
        return price - discountAmount;
    }

}
// Discount Amount = (Price × Discount %) / 100
// Final Price = Price - Discount Amount