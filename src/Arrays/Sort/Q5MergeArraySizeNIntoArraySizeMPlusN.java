package Arrays.Sort;
/**
 * Merge an array of size n into another array of size m+n
 * Difficulty Level : Easy
 * Last Updated : 20 Jan, 2021
 * There are two sorted arrays. First one is of size m+n containing only m elements. Another one is of size n and contains n elements. Merge these two arrays into the first array of size m+n such that the output is sorted.
 * Input: array with m+n elements (mPlusN[]).
 */

import Arrays.ArrayUtils;

public class Q5MergeArraySizeNIntoArraySizeMPlusN {

    public static void main(String[] args) {
        int mPlusN[] = {2, 8, -1, -1, -1, 13, -1, 15, 20};
        int N[] = {5, 7, 9, 25};
        int n = N.length;
        int m = mPlusN.length - n;

        /*Move the m elements at the end of mPlusN*/
        moveToEnd(mPlusN);

        /*Merge N[] into mPlusN[] */
        merge(mPlusN, N);


        /* Print the resultant mPlusN */
        ArrayUtils.printArray(mPlusN);

    }

    private static void merge(int[] mPlusN, int[] arr) {
        int i = arr.length;
        int j = 0, k = 0;
        while (j < arr.length && i < mPlusN.length) {
            if (arr[j] < mPlusN[i]) {
                mPlusN[k] = arr[j];
                j++;
                k++;
            } else if (arr[j] > mPlusN[i]) {
                mPlusN[k] = mPlusN[i];
                mPlusN[i] = -1;
                i++;
                k++;
            } else {
                mPlusN[k] = mPlusN[i];
                k++;
                i++;
                mPlusN[k] = arr[j];
                k++;
                j++;
            }
        }
        while (j < arr.length) {
            mPlusN[k] = arr[j];
            j++;
            k++;
        }

    }


    public static void rotateRight(int[] arr, int start, int end) {
        int temp = arr[end];
        for (int i = end; i > start; i--) {
            arr[i] = arr[i - 1];
        }
        arr[start] = temp;
    }

    public static void moveToEnd(int[] arr) {
        int i = 0, j = 0;
        while (j < arr.length) {
            if (arr[j] == -1) {
                rotateRight(arr, i, j);
                i++;
            }
            j++;
        }
    }
}
