package Arrays.Sort;

import Arrays.ArrayUtils;

import java.util.Arrays;

/**
 *
 */

public class Q2SortNearlySortedK {

    public static void main(String[] args) {
        int k = 3;
        int arr[] = {6, 5, 3, 2, 8, 10, 9};
        int n = arr.length;
        Arrays.sort(arr);
        System.out.println("Following is sorted array");
        ArrayUtils.printArray(arr);
    }

}
