package GeeksForGeeks.Arrays.Sort;

import java.util.Arrays;

import GeeksForGeeks.Arrays.*;

/**
 *
 */

public class Q1AlternativeSorting {

    public static void main(String[] args) {
        int arr[] = {1, 12, 4, 6, 7, 10};
        int n = arr.length;
        Arrays.sort(arr);
        alternateInsertionSort(arr, n - 1);
        ArrayUtils.printArray(arr);
    }

//    o(n2)
    public static void alternateInsertionSort(int[] arr, int end) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (i % 2 == 0) {
                    if (arr[j] > arr[i]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                } else {
                    if (arr[j] < arr[i]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
    }

//    o(nlogn)
    public static void alternateSort(int[] arr, int end) {
        int i = 0;
        while (i < arr.length) {
            rotateRight(arr, i, end);
            i += 2;
        }
    }


    private static void rotateRight(int[] arr, int start, int end) {
        int temp = arr[end];
        for (int i = end; i > start; i--) {
            arr[i] = arr[i - 1];
        }
        arr[start] = temp;
    }


}
