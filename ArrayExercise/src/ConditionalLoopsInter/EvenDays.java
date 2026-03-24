package ConditionalLoopsInter;

public class EvenDays {
    public static void main(String[] args) {
        int days = 31;
        int canGo = 0;

        for (int i = 1; i <= days; i++) {

            if (i % 2 == 0) {
                canGo++;
            }

        }
        System.out.println(canGo);
    }
}
