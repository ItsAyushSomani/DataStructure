package Arrays.Rearrangement;

import java.util.Arrays;

/**
 * Given an array of elements of length N, ranging from 0 to N – 1. All elements may not be present in the array. If the element is not present then there will be -1 present in the array. Rearrange the array such that A[i] = i and if i is not present, display -1 at that place.
 * <p>
 * Examples:
 * <p>
 * Input : arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1}
 * Output : [-1, 1, 2, 3, 4, -1, 6, -1, -1, 9]
 * <p>
 * Input : arr = {19, 7, 0, 3, 18, 15, 12, 6, 1, 8,
 * 11, 10, 9, 5, 13, 16, 2, 14, 17, 4}
 * Output : [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
 * 11, 12, 13, 14, 15, 16, 17, 18, 19]
 */

public class RearrangeArraySuchThatArriIsi1 {

    public static void main(String[] args) {
        int n, arr[] = {-1, -1, 6, 1, 9,
                3, 2, -1, 4, -1};
        n = arr.length;

        // Function Call
        fixArray(arr, n);
        Arrays.stream(arr).forEach(System.out::println);
    }

    public static void fixArray(int[] arr, int n) {
        int i = 0;
        while (i < n) {
            if (arr[i] >= 0) {
                arr[arr[i]] = i;
            }
            i++;
        }
        i = 0;
        while (i < n) {
            if (arr[i] != i) {
                arr[i] = -1;
            }
            i++;
        }
    }
}
