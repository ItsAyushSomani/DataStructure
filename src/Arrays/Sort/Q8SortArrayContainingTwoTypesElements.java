package Arrays.Sort;
/**
 *
 */

import Arrays.ArrayUtils;

public class Q8SortArrayContainingTwoTypesElements {

    public static void main(String[] args) {
        int arr[]
                = {1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0};
        segregate0and1(arr);
        ArrayUtils.printArray(arr);
    }

    public static void segregate0and1(int[] arr) {
        int i = 0, j = 0;
        while (j < arr.length && i < arr.length) {
            if (arr[i] == 0 && arr[j] == 1) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[i] == 1) i++;
            if (arr[j] == 0) j++;


        }

    }
}
