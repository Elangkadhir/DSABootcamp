public class AngoisticBinarySearch {
    public static void main(String[] args) {
        int[] arr = { 12, 23, 34, 45, 56, 67, 78 };
        int[] arr2 = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, -1, -2, -3, -4 };
        System.out.println(binarySearchDescending(arr2, 9));

    }

    static int binarySearchAscending(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            }
        }
        return -1;
    }

    static int binarySearchDescending(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                start = mid + 1;
            } else if (target > arr[mid]) {
                end = mid - 1;
            }
        }
        return -1;
    }
}