package GeeksForGeeks.DynamicProgramming.MCM;

import java.util.Arrays;

/**
 */

public class Q1MCM {

    public static void main(String[] args) {
        int[] arr = new int[] {2, 3, 4, 1, 3};
        int[][] dp = new int[arr.length + 1][arr.length + 1];
        for(int[] dpRow: dp) {
            Arrays.fill(dpRow, -1);
        }
        System.out.println(mcm(arr, 1, arr.length - 1, dp));
    }



    // Recursive solution to solve mcm
    public static int mcm(int[] arr, int i, int j, int[][] dp) {
        if(i >= j) {
            return dp[i][j] = 0;
        }
        if(dp[i][j] != -1) {
            return dp[i][j];
        }
        int result = Integer.MAX_VALUE - 1;
        for(int k = i; k < j; k++) {
            int tempResult = mcm(arr, i, k, dp) + mcm(arr, k+1, j, dp) + arr[i-1] * arr[k] * arr[j];
            result = Math.min(tempResult, result);
        }
        return dp[i][j] = result;
    }



}




