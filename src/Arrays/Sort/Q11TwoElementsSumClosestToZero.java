package Arrays.Sort;
/**
 *
 */

import Arrays.ArrayUtils;

import java.util.HashSet;

public class Q11TwoElementsSumClosestToZero {

    public static void main(String[] args) {
        int arr[] = {1, 60, -10, 70, -80, 85};
        tempMethod(arr);
    }

    public static void tempMethod(int[] arr) {
        int min = arr[0];
        int[] tempArray = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int newMin = Math.max(min, arr[i] - arr[j]);
                tempArray[0] = arr[i];
                tempArray[1] = arr[j];
            }
        }
        for (int ar : tempArray) {
            System.out.print(ar + "   ");
        }
    }
}
