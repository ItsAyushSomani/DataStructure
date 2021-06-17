package GeeksForGeeks.Arrays.Sort;

import GeeksForGeeks.Arrays.ArrayUtils;

/**
 *O(n2)
 *
 * Select min/max and swap
 */

public class SelectionSort {

    public static void main(String[] args) {
        int arr[] = {64, 25, 12, 22, 11};
        sort(arr);
        System.out.println("Sorted array");
        ArrayUtils.printArray(arr);
    }

    public static void sort(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int tempArr = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tempArr;
                }
            }
        }
    }
}
