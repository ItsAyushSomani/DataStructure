package Arrays.Sort;
/**
 *
 */

import Arrays.ArrayUtils;

import java.util.Arrays;

public class Q24MergeTwoSortedArrays {

    public static void main(String[] args) {
        int arr[] = {10};
        int brr[] = {2, 3};
//        int arr[] = new int[]{1, 5, 9, 10, 15, 20};
//        int brr[] = new int[]{2, 3, 8, 13};
        merge(arr, brr);
        ArrayUtils.printArray(arr);
        ArrayUtils.printArray(brr);
    }

    public static void merge(int[] arr, int[] brr) {
        int i = 0, j = 0;
        while (i < arr.length) {
            if (i < arr.length && j < brr.length) {
                if (arr[i] > brr[0]) {
                    int temp = arr[i];
                    arr[i] = brr[0];
                    brr[0] = temp;
                    i++;
                } else {
                    i++;
                }
                Arrays.sort(brr);
            }

        }

    }
}
