package GeeksForGeeks.Arrays.Sort;

import GeeksForGeeks.Arrays.ArrayUtils;

/**
 *
 */

public class Q3SortAccordingAbsoluteDifference {

    public static void main(String[] args) {
        int[] arr = {10, 5, 3, 9, 2};
        int n = arr.length;
        int x = 7;
        rearrange(arr, x);
        ArrayUtils.printArray(arr);
    }

    public static void rearrange(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            int min = Math.abs(x - arr[i]);
            for (int j = i + 1; j < arr.length; j++) {
                int diff = Math.abs(x - arr[j]);
                if (min > diff) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
