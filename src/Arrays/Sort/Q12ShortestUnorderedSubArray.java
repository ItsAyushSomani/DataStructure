package Arrays.Sort;
/**
 *
 */

import Arrays.ArrayUtils;

public class Q12ShortestUnorderedSubArray {

    public static void main(String[] args) {
        int ar[] = new int[]{1, 2, 3, 4, 5};
        System.out.println(shortestUnsorted(ar));
    }

    public static int shortestUnsorted(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                count++;
            }
        }
        if (count == 0) {
            return 0;
        } else {
            return 3;
        }
    }
}
