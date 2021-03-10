package Arrays.search;

import java.util.Arrays;

/**
 *
 */

public class SubarrayWithGivenSum {

    public static void main(String[] args) {
        int arr[] = {15, 2, 4, 8, 9, 5, 10, 23};
        int n = arr.length;
        int sum = 23;
        subArraySum(arr, n, sum);
    }

    public static void subArraySum(int arr[], int n, int sum) {
        int i, j;
        for (i = 0; i < arr.length; i++) {
            int interSum = arr[i];
            for (j = i + 1; j < arr.length; j++) {
                interSum += arr[j];
                if (interSum > sum) {
                    break;
                } else if (interSum == sum) {
                    System.out.println(i + "to" + j);
                    return;
                }
            }
        }
    }
}
