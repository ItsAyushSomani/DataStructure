package Arrays.Rearrangement;

import Arrays.ArrayUtils;

/**
 *Given an array (or string), the task is to reverse the array/string.
 * Examples :
 *
 *
 * Input  : arr[] = {1, 2, 3}
 * Output : arr[] = {3, 2, 1}
 *
 * Input :  arr[] = {4, 5, 1, 2}
 * Output : arr[] = {2, 1, 5, 4}
 */

public class ReverseArrayORString2 {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        ArrayUtils.printArray(arr);
        rvereseArray(arr, 0, 5);
        System.out.print("Reversed array is \n");
        ArrayUtils.printArray(arr);

        rvereseArrayRecursively(arr, 0, 5);
        System.out.print("Reversed array Recursive is \n");
        ArrayUtils.printArray(arr);
    }

    public static void rvereseArray(int[] arr, int start, int end) {
        int mid = (start + end) / 2;
        for (int i = 0; i <= mid; i++) {
            int temp = arr[i];
            arr[i] = arr[end - i];
            arr[end - i] = temp;
        }
    }

    public static void rvereseArrayRecursively(int[] arr, int start, int end) {
        if (start >= end) return;

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        rvereseArrayRecursively(arr, ++start, --end);
    }
}
