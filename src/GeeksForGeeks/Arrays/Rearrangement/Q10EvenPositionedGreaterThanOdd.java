package GeeksForGeeks.Arrays.Rearrangement;

import GeeksForGeeks.Arrays.ArrayUtils;

/**
 * Given an array A of n elements, sort the array according to the following relations :
 * <p>
 * A[i] >= A[i-1]
 * <p>
 * <p>
 * , if i is even.
 * <p>
 * A[i] <= A[i-1]
 * <p>
 * <p>
 * , if i is odd.
 * Print the resultant array.
 * <p>
 * even position wala uski ek position wale se chota hona chahiye
 */

public class Q10EvenPositionedGreaterThanOdd {

    public static void main(String[] args) {
        int n = 5;
        int arr[] = {1, 3, 2, 2, 5};
        rearrange(arr, n);
        ArrayUtils.printArray(arr);
    }

    public static void rearrange(int[] arr, int n) {
        for (int i = 1; i < n; i++) {

            // if index is even
            if (i % 2 == 0) {
                if (arr[i] > arr[i - 1]) {

                    // swap two elements
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                }
            }

            // if index is odd
            else {
                if (arr[i] < arr[i - 1]) {

                    // swap two elements
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                }
            }
        }
    }
}
