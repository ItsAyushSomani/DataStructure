package GeeksForGeeks.Arrays.Sort;

import GeeksForGeeks.Arrays.ArrayUtils;

/**
 *
 */

public class Q7Sort1toNSwappingAdjacentElements {

    public static void main(String[] args) {
//        Employee case1
//        int arr[] = {1, 2, 5, 3, 4, 6};
//        boolean brr[] = {false, true, true, true, false};
        int arr[] = {2, 3, 1, 4, 5, 6};
        boolean brr[] = {false, true, true, true, true};
        if (sortedAfterSwap(arr, brr)) {
            System.out.println("A can be sorted");
        } else {
            System.out.println("A can not be sorted");
        }
        ArrayUtils.printArray(arr);
    }


    public static boolean sortedAfterSwap(int[] arr, boolean[] brr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (brr[i] && arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
