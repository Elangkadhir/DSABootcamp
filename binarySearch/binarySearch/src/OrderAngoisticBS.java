public class OrderAngoisticBS {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] arr2 = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, -1, -2, -3, -4 };
        System.out.println("length : " + arr.length + " " + arr2.length);
        System.out.println("target for 1 : " + findElement(arr, 1));
        System.out.println("target for 2 : " + findElement(arr2, 9));
    }

    static int findElement(int arr[], int target) {

        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else if (arr[mid] > target) {
                    end = mid - 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                }
            }

        }
        return -1;

    }
}
