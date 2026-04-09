public class Main {

    public static void main(String[] args) {
        int arr[] = { 8, 2, 3, 4, 5, 6, 7, 9 };
        int target = -1;
        boolean result = linearSearch3(arr, target);
        if (result) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    // search the target and return the element itself
    static boolean linearSearch3(int arr[], int target) {
        if (arr.length == 0) {
            return false;
        }
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        return false;
    }

    // search the target and return the element itself
    static int linearSearch2(int arr[], int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }

    // search the target and return the index

    static int linearSearch(int arr[], int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
