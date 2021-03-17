package Arrays.search;
/**
 *
 */

import Arrays.ArrayUtils;

public class Q18FindPeakElements {

    public static void main(String[] args) {
        int arr[] = {1, 3, 20, 4, 1, 0};
        System.out.println("Peak Element is "
                + Search(arr));
    }

    public static int Search(int[] arr) {
        if (arr.length == 1)
            return arr[0];
        if (arr[0] >= arr[1])
            return 0;
        if (arr[arr.length - 1] >= arr[arr.length - 2])
            return arr.length - 1;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i - 1] &&
                    arr[i] >= arr[i + 1])
                return i;
        }
        return 0;
    }
}
