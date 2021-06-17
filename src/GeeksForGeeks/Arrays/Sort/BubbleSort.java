package GeeksForGeeks.Arrays.Sort;

import GeeksForGeeks.Arrays.ArrayUtils;

/**
 * Throw to largest element to last, always start from 0th index till length minus i
 */

public class BubbleSort {

    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6};
        sort(arr);
        ArrayUtils.printArray(arr);
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < (arr.length-1-i); j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
