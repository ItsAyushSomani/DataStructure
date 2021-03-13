package Arrays.Rearrangement;

import Arrays.ArrayUtils;

import java.util.Arrays;

/**
 *Given two integer arrays of same size, “arr[]” and “index[]”, reorder elements in “arr[]” according to given index array. It is not allowed to given array arr’s length.
 *
 * Example:
 *
 * Input:  arr[]   = [10, 11, 12];
 *         index[] = [1, 0, 2];
 * Output: arr[]   = [11, 10, 12]
 *         index[] = [0,  1,  2]
 *
 * Input:  arr[]   = [50, 40, 70, 60, 90]
 *         index[] = [3,  0,  4,  1,  2]
 * Output: arr[]   = [40, 60, 90, 50, 70]
 *         index[] = [0,  1,  2,  3,   4]
 */

public class Q13ReorderArrayAccToIndex {

    public static void main(String[] args) {
//        int arr[] = new int[]{50, 40, 70, 60, 90};
//        int index[] = new int[]{3, 0, 4, 1, 2};

        int arr[] = new int[]{10, 11, 12};
        int index[] = new int[]{1, 0, 2};
        reorder(arr, index);
        System.out.println("Reordered array is: ");
        ArrayUtils.printArray(arr);
        System.out.println("Modified Index array is:");
        ArrayUtils.printArray((index));
    }

//    Should be done by heapsort complexity O(nlogn)
    public static void reorder(int[] arr, int[] index) {
        int min = arr[0];
        for (int i = 0; i < index.length; i++) {
            for (int j = i + 1; j < index.length; j++) {
                if (index[i] > index[j]) {
                    int tempIndex = index[i];
                    int tempArr = arr[i];
                    index[i] = index[j];
                    arr[i] = arr[j];
                    index[j] = tempIndex;
                    arr[j] = tempArr;
                }
            }
        }
    }
}
