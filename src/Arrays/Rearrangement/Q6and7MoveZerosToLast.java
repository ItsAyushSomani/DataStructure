package Arrays.Rearrangement;

import java.util.Arrays;

/**
 *
 */

public class Q6and7MoveZerosToLast {

    public static void main(String[] args) {
        int[] arr = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};
        // op => 1  9  8  4  2  7  6  0  0  0  0
        moveZeroToLast(arr);
        Arrays.stream(arr).forEach(System.out::print);

    }

    public static void moveZeroToLast(int[] arr) {
        int i = 0;
        int lastNonZeroIndex = -1;
        while (i < arr.length) {
            if (arr[i] != 0 && lastNonZeroIndex != i) {
                lastNonZeroIndex++;
                int temp = arr[i];
                arr[i] = arr[lastNonZeroIndex];
                arr[lastNonZeroIndex] = temp;
            }
            i++;
        }
    }
}
