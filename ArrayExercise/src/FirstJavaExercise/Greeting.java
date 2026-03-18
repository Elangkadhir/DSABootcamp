package FirstJavaExercise;

public class Greeting {
    public static void main(String[] args) {
        System.out.println(greet("Kadhir"));
    }

    static String greet(String name) {
        return "Hello " + name;
    }
}
