package Arrays.Rearrangement;

import Arrays.ArrayUtils;

import java.util.Arrays;

/**
 *Given a sorted array of positive integers, rearrange the array alternately i.e first element should be maximum value, second minimum value, third second max, fourth second min and so on.
 *
 * Examples:
 *
 * Input: arr[] = {1, 2, 3, 4, 5, 6, 7}
 * Output: arr[] = {7, 1, 6, 2, 5, 3, 4}
 *
 * Input: arr[] = {1, 2, 3, 4, 5, 6}
 * Output: arr[] = {6, 1, 5, 2, 4, 3}
 */

public class Q17and18MaximumMinimumSet {

    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50, 60};

//        testcase 1
//        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;

        System.out.println("Given array is ");
        ArrayUtils.printArray(arr);

//        arr = rearrangeMaxMin(arr, n);
        rearrange(arr, n);
        System.out.println("Modified array is ");
        ArrayUtils.printArray(arr);
    }

    public static int[] rearrangeMaxMin(int[] arr, int n) {
        int[] tempArray = Arrays.copyOf(arr, n);
        n = n - 1;
        for (int i = 0, j = 0; i <= n; i += 2, j++) {
            tempArray[i] = arr[n - j];
        }
        for (int i = 1, j = 0; i <= n; i += 2, j++) {
            tempArray[i] = arr[j];
        }
        return tempArray;
    }


//    {10, 20, 30, 40, 50, 60}
//61
//
//        10+ 60*61, 20 + 10*61, 30+ 50*61, 40 + 20*61, 50+ 40*61, 60 + 30*61
//
//        60 10 50 20 40 30


    public static void rearrange(int arr[], int n)
    {
        // initialize index of first minimum and first
        // maximum element
        int max_idx = n - 1, min_idx = 0;

        // store maximum element of array
        int max_elem = arr[n - 1] + 1;

        // traverse array elements
        for (int i = 0; i < n; i++) {
            // at even index : we have to put
            // maximum element
            if (i % 2 == 0) {
                arr[i] += (arr[max_idx] % max_elem) * max_elem;
                max_idx--;
            }

            // at odd index : we have to put minimum element
            else {
                arr[i] += (arr[min_idx] % max_elem) * max_elem;
                min_idx++;
            }
        }

        // array elements back to it's original form
        for (int i = 0; i < n; i++)
            arr[i] = arr[i] / max_elem;
    }
}
