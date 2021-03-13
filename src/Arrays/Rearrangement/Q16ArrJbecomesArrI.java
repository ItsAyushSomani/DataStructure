package Arrays.Rearrangement;

import Arrays.ArrayUtils;

import java.util.Arrays;

/**
 *Given an array of size n where all elements are distinct and in range from 0 to n-1, change contents of arr[] so that arr[i] = j is changed to arr[j] = i.
 * Examples:
 *
 *
 * Example 1:
 * Input: arr[]  = {1, 3, 0, 2};
 * Output: arr[] = {2, 0, 3, 1};
 * Explanation for the above output.
 * Since arr[0] is 1, arr[1] is changed to 0
 * Since arr[1] is 3, arr[3] is changed to 1
 * Since arr[2] is 0, arr[0] is changed to 2
 * Since arr[3] is 2, arr[2] is changed to 3
 *
 * Example 2:
 * Input: arr[]  = {2, 0, 1, 4, 5, 3};
 * Output: arr[] = {1, 2, 0, 5, 3, 4};
 *
 * Example 3:
 * Input: arr[]  = {0, 1, 2, 3};
 * Output: arr[] = {0, 1, 2, 3};
 *
 * Example 4:
 * Input: arr[]  = {3, 2, 1, 0};
 * Output: arr[] = {3, 2, 1, 0};
 */

public class Q16ArrJbecomesArrI {

    public static void main(String[] args) {

//        int arr[] = {1, 3, 0, 2};

//        testcase 1
        int arr[] = {2, 0, 1, 4, 5, 3};
        int n = arr.length;

        System.out.println("Given array is ");
        ArrayUtils.printArray(arr);

        arr = rearrangeNaive(arr, n);

        System.out.println("Modified array is ");
        ArrayUtils.printArray(arr);
    }

    public static int[] rearrangeNaive(int[] arr, int n) {
        int[] tempArray = new int[n];
        for (int i = 0; i < n; i++) {
            tempArray[arr[i]] = i;
        }
        return tempArray;
    }

}
