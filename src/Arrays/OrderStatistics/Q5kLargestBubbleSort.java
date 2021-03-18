package Arrays.OrderStatistics;
/**
 *
 */

import Arrays.ArrayUtils;

public class Q5kLargestBubbleSort {

    public static void main(String[] args) {
        int arr[] = {1, 23, 12, 9,
                30, 200, 50};
        int k = 3;
        System.out.println(bubbleSort(arr, k));
        ArrayUtils.printArray(arr);
    }

    public static int bubbleSort(int[] arr, int k) {
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < (arr.length - i - 1); j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr[arr.length - k];
    }
}
