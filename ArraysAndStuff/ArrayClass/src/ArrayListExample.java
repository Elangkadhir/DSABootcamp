import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>(10);
        // list.add(90);
        // list.add(90);
        // list.add(54);
        // list.add(87);
        // list.add(97);

        // System.out.println(list);
        // System.out.println(list.contains(54));
        // System.out.println(list.set(0, 54));
        // System.out.println(list.remove(3));

        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());

        }
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));

        }
        System.out.println(list);

    }

}
