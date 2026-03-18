package FirstJavaExercise;

public class SImpleInterest {
    public static void main(String[] args) {

        System.out.println(giveInterest(1200, 20, 20));
    }

    static double giveInterest(double p, double r, double t) {
        return (p * r * t) / 100;
    }
}
