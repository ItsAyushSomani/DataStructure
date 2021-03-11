package Arrays.Rearrangement;

import java.util.Arrays;

import Arrays.ArrayUtils;

/**
 *Given an array of n elements. Our task is to write a program to rearrange the array such that elements at even positions are greater than all elements before it and elements at odd positions are less than all elements before it.
 *
 * Examples:
 *
 * Input : arr[] = {1, 2, 3, 4, 5, 6, 7}
 * Output : 4 5 3 6 2 7 1
 *
 * Input : arr[] = {1, 2, 1, 4, 5, 6, 8, 8}
 * Output : 4 5 2 6 1 8 1 8
 */

public class RearrangeArray3 {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 1, 4, 5, 6, 8, 8};
        int size = 7;
        rearrangeArr(arr);
        ArrayUtils.printArray(arr);
    }

    public static void rearrangeArr(int[] arr) {
        int n = arr.length;
        int[] tempArray = Arrays.copyOf(arr, arr.length);
        Arrays.sort(tempArray);
        int mid = (int) Math.ceil(Double.valueOf(n) / 2);
        for (int i = 1; i < arr.length; i += 2) {
            arr[i] = tempArray[mid];
            mid++;
        }
        mid = (int) Math.ceil(Double.valueOf(n) / 2) - 1;
        for (int i = 0; i < arr.length; i += 2) {
            arr[i] = tempArray[mid];
            mid--;
        }
    }
}
