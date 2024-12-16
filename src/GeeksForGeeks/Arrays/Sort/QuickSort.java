package GeeksForGeeks.Arrays.Sort;

import GeeksForGeeks.Arrays.ArrayUtils;

/**
 *
 */

public class QuickSort {

    public static void main(String[] args) {
        int arr[] = {10, 7, 8, 9, 1, 5};
        int n = arr.length;
        System.out.println("Orignal array");
        ArrayUtils.printArray(arr);
        quickSort(arr, 0, n - 1);
        System.out.println("Sorted array");
        ArrayUtils.printArray(arr);
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int p = partition(arr, start, end);
            // Recursively sort elements before
            // partition and after partition
            quickSort(arr, start, p - 1);
            quickSort(arr, p + 1, end);
        }
    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[start];
        while (start <= end) {
            while (arr[start] < pivot) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }
            if (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }

        }
        return start;
    }
}
