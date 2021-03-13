package Arrays.Rearrangement;

import Arrays.ArrayUtils;

/**
 *
 */

public class Q8BringAllElementsLessThanKTogether {

    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 6, 3};
        int n = arr.length - 1;
        int k = 3;
        System.out.print(minSwap(arr, n, k) + "\n");

        int arr1[] = {2, 7, 9, 5, 8, 7, 4};
        n = arr1.length - 1;
        k = 5;
        System.out.print(minSwap(arr1, n, k));
    }

    public static int minSwap(int[] arr, int n, int k) {
        int swap = 0;
        int start = 0, end = n;
        while (start < end) {
            if (arr[start] >= k && arr[end] <= k) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                swap++;
                end--;
            }
            if (arr[end] > k) {
                end--;
            }
            if (arr[start] <= k)  {
                start++;
            }
        }
        ArrayUtils.printArray(arr);
        return swap;
    }
}
