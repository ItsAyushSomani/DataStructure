package GeeksForGeeks.Arrays.Rearrangement;

import java.util.Arrays;

/**
 *  *For a given array of n integers and assume that ‘0’ as an invalid number and all other as a valid number. Convert the array in such a way that if both current and next element is valid then double current value and replace the next number with 0. After the modification, rearrange the array such that all 0’s shifted to the end.
 * Examples:
 *
 * Input : arr[] = {2, 2, 0, 4, 0, 8}
 * Output : 4 4 8 0 0 0
 *
 * Input : arr[] = {0, 2, 2, 2, 0, 6, 6, 0, 0, 8}
 * Output :  4 2 12 8 0 0 0 0 0 0
 */

public class Q12DoubleTheFirstElementandMoveZerotoLast {

    public static void main(String[] args) {
        int[] arr = {2, 2, 0, 4, 0, 8};
        // op => 4 4 8 0 0 0
        doubleFirstElementMoveZeroToLast(arr);
        Arrays.stream(arr).forEach(System.out::print);
    }

    public static void doubleFirstElementMoveZeroToLast(int[] arr) {
        int i = 0;
        int lastNonZeroIndex = -1;
        while (i < arr.length) {
            if (arr[i] != 0 && lastNonZeroIndex != i) {
                lastNonZeroIndex++;
                int temp = arr[i];
                arr[i] = arr[lastNonZeroIndex];
                arr[lastNonZeroIndex] = temp;
            } else if(lastNonZeroIndex == i) {
                arr[i] = arr[i] * 2;
                arr[i+1] = 0;
            }
            i++;
        }
    }
}
