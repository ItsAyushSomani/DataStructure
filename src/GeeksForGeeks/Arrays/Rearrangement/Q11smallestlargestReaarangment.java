package GeeksForGeeks.Arrays.Rearrangement;

import GeeksForGeeks.Arrays.ArrayUtils;

import java.util.Arrays;

/**
 *
 */

public class Q11smallestlargestReaarangment {

    public static void main(String[] args) {
        int arr[] = {5, 8, 1, 4, 2, 9, 3, 7, 6};
        rearrangeArray(arr, arr.length - 1);
        ArrayUtils.printArray(arr);
    }

    public static void rearrangeArray(int[] arr, int n) {
        int[] tempArray = Arrays.copyOf(arr, arr.length);
        Arrays.sort(tempArray);

        for (int i = 1, j = 0; j <= n/2; i+=2, j++) {
            arr[i - 1] = tempArray[j];
            if(j < n/2)
            arr[i] = tempArray[n - j];
        }

    }
}
