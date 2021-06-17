package GeeksForGeeks.Arrays.Sort;
/**
 *
 */

import GeeksForGeeks.Arrays.ArrayUtils;

public class Q23ConstructArrayPairSumarray {

    public static void main(String[] args) {
        int arr[] = {15, 13, 11, 10, 12, 10, 9, 8, 7, 5};
        ArrayUtils.printArray(constructArr(arr));
    }

    public static int[] constructArr(int[] arr) {
        int newArraySize = (arr.length * (arr.length + 1)) / 2;
        int[] newArr = new int[newArraySize];
        for (int i = 0, k = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                newArr[k] = arr[i] + arr[j];
                k++;
            }
        }
        return newArr;
    }
}
