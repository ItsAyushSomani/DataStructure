package DynamicProgramming.knapsack01;
/**
 *
 */

import Arrays.ArrayUtils;
import Arrays.PrintMatrix;

import java.nio.file.Paths;

public class Q2SubsetSumProblem {

    public static void main(String[] args) {
        int wt[] = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        int n = wt.length;
        if (isSubsetSum(wt, n, sum) == true)
            System.out.println("Found a subset"
                    + " with given sum");
        else
            System.out.println("No subset with"
                    + " given sum");
    }

    public static boolean isSubsetSum(int[] wt, int n, int W) {
        boolean t[][] = new boolean[n + 1][W + 1];
        for (int i = 0; i <= n; i++)
            t[0][i] = true;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= W; j++) {
                if (wt[i - 1] <= j) {
                    t[i][j] = t[i][j - wt[i - 1]] || t[i - 1][j];
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        return t[n][W];
    }

}
