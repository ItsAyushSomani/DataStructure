package Arrays.OrderStatistics;

import java.util.Arrays;

/**
 *Given an array and a number k where k is smaller than size of array, we need to find the k’th smallest element in the given array. It is given that all array elements are distinct.
 *
 * Examples:
 *
 * Input: arr[] = {7, 10, 4, 3, 20, 15}
 * k = 3
 * Output: 7
 *
 * Input: arr[] = {7, 10, 4, 3, 20, 15}
 * k = 4
 * Output: 10
 */

public class Q1KthSmallestLargestElement {

    public static void main(String[] args) {
        int arr[] = { 12, 3, 5, 7, 19 };
        int n = arr.length, k = 2;

        System.out.print("K'th smallest element is " +
                kthSmallest(arr, n, k));
    }

    public static int kthSmallest(int[] arr, int n, int k) {
        Arrays.sort(arr);
        return arr[k-1];
    }
}
