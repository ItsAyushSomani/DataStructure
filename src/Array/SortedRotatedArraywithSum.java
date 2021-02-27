package Array;

/**
 * Given an array that is sorted and then rotated around an unknown point.
 * Find if the array has a pair with a given sum ‘x’. It may be assumed that all elements in the array are distinct.
 * Input: arr[] = {11, 15, 6, 8, 9, 10}, x = 16
 * Output: true
 * There is a pair (6, 10) with sum 16
 * <p>
 * Input: arr[] = {11, 15, 26, 38, 9, 10}, x = 35
 * Output: true
 * There is a pair (26, 9) with sum 35
 * <p>
 * Input: arr[] = {11, 15, 26, 38, 9, 10}, x = 45
 * Output: false
 * There is no pair with sum 45.
 **/


public class SortedRotatedArraywithSum {

    public static void main(String[] args) {
        int[] arr = {11, 15, 26, 38, 9, 10};
        sort(arr);
        int sum = 45;
        for (int i = 0; i < arr.length; i++) {
            int position = search(arr, 0, arr.length - 1, sum - arr[i]);
            if (position != -1) {
                System.out.println("pair is (" + arr[i] + ", " + arr[position] + ")");
                break;
            }
        }
    }

    public static void sort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }

    public static int search(int arr[], int start, int end, int toBeSearched) {
        if (start <= end) {
            if (start == (arr.length - 1) && end == 0) {
                return -1;
            }
            int mid = (start + end) / 2;
            if (arr[mid] == toBeSearched) {
                return mid;
            }
            if (arr[start] > toBeSearched && arr[end] < toBeSearched)
                return search(arr, start, mid, toBeSearched);

            return search(arr, mid + 1, end, toBeSearched);
        }
        return -1;
    }
}
