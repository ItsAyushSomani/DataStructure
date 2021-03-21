package DynamicProgramming;
/**
 *
 */

import Arrays.ArrayUtils;
import Arrays.PrintMatrix;

public class Q4CountSubSetSum {

    public static void main(String[] args) {
        int arr[] = {1, 2, 7};
        int sum = 9;
        int n = arr.length;
        int numberOfSubsets = countSubSetSum(arr, n, sum);
        if (numberOfSubsets > 0)
            System.out.println("Found " + numberOfSubsets +
                    " subsets with given sum");
        else
            System.out.println("No subset with"
                    + " given sum");
    }

    public static int countSubSetSum(int[] arr, int n, int sum) {
        int t[][] = new int[n + 1][sum + 1];
        for (int i = 0; i <= n; i++) {
            t[i][0] = 1;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (arr[i - 1] <= j) {
                    t[i][j] = t[i - 1][j - arr[i - 1]] + t[i - 1][j];
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        PrintMatrix.printMatrix(t);
        return t[n][sum];
    }
}
