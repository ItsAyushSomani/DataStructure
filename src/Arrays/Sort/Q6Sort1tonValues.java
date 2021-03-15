package Arrays.Sort;

import Arrays.ArrayUtils;

/**
 *
 */

public class Q6Sort1tonValues {

    public static void main(String[] args) {
        int[] arr = {10, 7, 9, 2, 8,
                3, 5, 4, 6, 1};
        sortit(arr);
        ArrayUtils.printArray(arr);
    }

    public static void sortit(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
    }
}
