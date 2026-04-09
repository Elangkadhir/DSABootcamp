public class SearchInRange {
    public static void main(String[] args) {
        int arr[] = { 8, 2, 3, 4, 5, -7, 6, 7, 9 };
        int target = 5;
        int start = 2;
        int end = 6;
        // int result = searchInRange(arr, target, start, end);
        int result2 = minimumInRange(arr, start, end);
        System.out.println("Element found at index: " + result2);
    }

    static int searchInRange(int arr[], int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    static int minimumInRange(int arr[], int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        int min = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;

    }
}
