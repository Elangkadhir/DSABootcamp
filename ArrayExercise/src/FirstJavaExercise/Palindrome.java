package FirstJavaExercise;

public class Palindrome {
    public static void main(String[] args) {
        String pal = "madam";
        boolean ispal = true;
        int start = 0;
        int end = pal.length() - 1;

        while (start < end) {
            if (pal.charAt(start) != pal.charAt(end)) {
                ispal = false;
                break;
            }
            start++;
            end--;
        }
        if (ispal) {
            System.out.println("true");
        } else {

            System.out.println("false");
        }
    }
}
