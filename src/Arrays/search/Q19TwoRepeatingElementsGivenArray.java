package Arrays.search;
/**
 *
 */

import Arrays.ArrayUtils;

public class Q19TwoRepeatingElementsGivenArray {

    public static void main(String[] args) {
        int arr[] = {4, 2, 4, 5, 2, 3, 1};
        int arr_size = arr.length;
        printRepeating(arr);
    }

    public static void printRepeating(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[Math.abs(arr[i])] < 0) {
                System.out.println(Math.abs(arr[i]));
            } else {
                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
            }
        }
    }
}
