package GeeksForGeeks.Arrays.Sort;
/**
 *
 */

import GeeksForGeeks.Arrays.ArrayUtils;

public class Q16SortArray0s1s2s {

    public static void main(String[] args) {
        int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
//        GeeksForGeeks.Arrays.sort(arr);
        sort012(arr);
        System.out.println("Array after seggregation ");
        ArrayUtils.printArray(arr);
    }

    public static void sort012(int[] arr) {
        int i = 0, j = 0;
        while (i < arr.length) {
            if (arr[i] == 0) {
                rotateRight(arr, j, i);
                j++;
            }
            i++;
        }
        i = j;
        while (i < arr.length) {
            if (arr[i] == 1) {
                rotateRight(arr, j, i);
                j++;
            }
            i++;
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

