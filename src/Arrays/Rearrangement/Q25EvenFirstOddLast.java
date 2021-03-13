package Arrays.Rearrangement;

import java.util.Arrays;
import Arrays.ArrayUtils;
/**
 *
 */

public class Q25EvenFirstOddLast {

    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 4, 7, 6, 9, 10 };
//        int arr[] = {1, 2, 3, 4};
//        rotateRight(arr, 0, 3);
        Arrays.sort(arr);
        ArrayUtils.printArray(arr);
        reArrangeWithSingleTraversal(arr);
        ArrayUtils.printArray(arr);
    }

    // o(n) , single traversal; // solution for move Zeros to end
    private static void reArrangeWithSingleTraversal(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = 0;
        while (j < n) {
            if (arr[j] % 2 == 0) {  // if need to move positive to end change this cond to arr[i]<0
                rotateRight(arr, i, j);
                i++;
            } else if (arr[j] == 0) {
                rotateRight(arr, i, j);
            }
            j++;
        }
    }

    public static void rotateRight(int[] arr, int start, int end) {
        int temp = arr[end];
        for (int i = end; i > start; i--) {
            arr[i] = arr[i - 1];
        }
        arr[start] = temp;
    }
}
