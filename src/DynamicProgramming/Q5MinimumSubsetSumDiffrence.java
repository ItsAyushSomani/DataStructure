package DynamicProgramming;
/**
 * Given a set of integers, the task is to divide it into two sets S1 and S2 such that the absolute difference between their sums is minimum.
 * If there is a set S with n elements, then if we assume Subset1 has m elements, Subset2 must have n-m elements and the value of abs(sum(Subset1) – sum(Subset2)) should be minimum.
 * Example:
 * <p>
 * Input:  arr[] = {1, 6, 11, 5}
 * Output: 1
 * Explanation:
 * Subset1 = {1, 5, 6}, sum of Subset1 = 12
 * Subset2 = {11}, sum of Subset2 = 11
 */

import Arrays.*;

import java.util.Arrays;

public class Q5MinimumSubsetSumDiffrence {

    public static void main(String[] args) {
        int arr[] = {3, 1, 4, 2, 2, 1};
        int n = arr.length;
        int sumOfAllElementsInArray = Arrays.stream(arr).sum();
        System.out.println("The minimum difference between 2 sets is "
                + findMin(arr, n, sumOfAllElementsInArray));
    }

    public static int findMin(int[] arr, int n, int sum) {
        boolean t[][] = new boolean[n + 1][sum + 1];
        Arrays.fill(t[0], false);
        for (int i = 0; i <= arr.length; i++) {
            t[i][0] = true;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (arr[i - 1] <= j) {
                    t[i][j] = t[i - 1][j - arr[i - 1]] || t[i - 1][j];
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        PrintMatrix.printBooleanMatrix(t);
        for (int i = sum / 2; i > 0; i--) {
            if (t[n][i] == true) {
                return (sum - (2 * i));
            }
        }
        return -1;
    }
}
