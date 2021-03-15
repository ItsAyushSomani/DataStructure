package Arrays.Sort;

import Arrays.ArrayUtils;

/**
 *
 */

public class Q4SortArrayWaveForm {

    public static void main(String[] args) {
        int arr[] = {10, 90, 49, 2, 1, 5, 23, 3};
        int n = arr.length;
        sortInWave(arr);
        ArrayUtils.printArray(arr);
    }

    public static void sortInWave(int[] arr) {
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
}
