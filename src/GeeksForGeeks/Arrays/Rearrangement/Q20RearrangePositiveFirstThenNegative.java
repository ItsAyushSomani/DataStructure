package GeeksForGeeks.Arrays.Rearrangement;

import java.util.Arrays;

import GeeksForGeeks.Arrays.ArrayUtils;

/**
 *
 */

public class Q20RearrangePositiveFirstThenNegative {

    public static void main(String[] args) {
        int arr[] = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
//        int arr[] = {1, 2, 3, 4};
//        rotateRight(arr, 0, 3);
        Arrays.sort(arr);
        ArrayUtils.printArray(arr);
        reArrangeWithSingleTraversal(arr);
        ArrayUtils.printArray(arr);
    }

    public static void reArrangeWithSingleTraversal(int[] arr) {
        int i = 0, j = 0;

        while (i < arr.length) {
            if (arr[i] > 0) {
                rotateRight(arr, i, j);
                i++;
            } else if (arr[i] == 0) {
                rotateRight(arr, i, j);
            }
            j++;
        }

    }

    public static void rotateRight(int[] arr, int start, int end) {
        int temp = arr[end];
        for (int i = end; i > start; i--) {
            arr[i] = arr[i - 1];
        }
        arr[start] = temp;
    }
}
