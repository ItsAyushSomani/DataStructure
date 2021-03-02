package Arrays.Rotation;

/**
 * Consider an array of distinct numbers sorted in increasing order. The array has been rotated (clockwise) k number of times.
 * Given such an array, find the value of k.
 * Input : arr[] = {15, 18, 2, 3, 6, 12}
 * Output: 2
 * Explanation : Initial array must be {2, 3,
 * 6, 12, 15, 18}. We get the given array after
 * rotating the initial array twice.
 * <p>
 * Input : arr[] = {7, 9, 11, 12, 5}
 * Output: 4
 * <p>
 * Input: arr[] = {7, 9, 11, 12, 15};
 * Output: 0
 */


public class RotationCountRotatedSortedarray {

    public static void main(String[] args) {
        int[] arr = {7, 9, 11, 12, 15};
        int count = search(arr, 0, arr.length-1);
        System.out.println(count);

    }


    //linear Array.search complexity o(n)
    public static int countRotations(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                return i;
            }
        }
        return 0;
    }

    //binary Array.search complexity o(logn)

    public static int search(int arr[], int start, int end) {
        if (start >= end) {
            return 0;
        }
        int mid = (start + end) / 2;
        if (arr[mid] < arr[mid - 1]) {
            return mid;
        } else if (arr[mid] < arr[0]) {
            return search(arr, 0, mid);
        } else {
            return search(arr, mid + 1, end);
        }

    }
}
