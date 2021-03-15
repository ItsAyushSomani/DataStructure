package Arrays.Sort;
/**
 *
 */

import Arrays.ArrayUtils;

public class Q19CountPossibleTriangles {

    public static void main(String[] args) {
        int arr[] = {10, 21, 22, 100, 101, 200, 300};
        System.out.println("Total number of triangles possible is " +
                findNumberOfTriangles(arr));
    }

    public static int findNumberOfTriangles(int[] arr) {
        int i = 0, j = 1, k = 2, count = 0;
        while (j < arr.length - 2) {
            if (k == arr.length) {
                i++;
                j++;
                k = j + 1;
            }
            if (arr[k] < (arr[i] + arr[j])) {
                count++;
            }
            k++;
        }
        return count;
    }
}
