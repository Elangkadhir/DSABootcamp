package ConditionalLoopsInter;

import java.util.Scanner;

public class VowelOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char letter = in.next().charAt(0);

        letter = Character.toLowerCase(letter);

        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            System.out.println("It is a Vowel");
        } else {
            System.out.println("It is NOT a Vowel");
        }
    }
}