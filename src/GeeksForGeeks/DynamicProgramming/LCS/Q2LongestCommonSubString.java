package GeeksForGeeks.DynamicProgramming.LCS;
/**
 *
 */

import GeeksForGeeks.Arrays.PrintMatrix;

import java.util.Arrays;

public class Q2LongestCommonSubString {

    public static void main(String[] args) {
        String X = "GeeksforGeeks";
        String Y = "GesQuizforG";
        int m = X.length();
        int n = Y.length();
        System.out.println(LCSubString(X.toCharArray(),
                Y.toCharArray(), m,
                n));
        int[][] dp = new int[m+1][n+1];
        for(int[] dpChild: dp) {
            Arrays.fill(dpChild, -1);
        }
        System.out.println(lcsRecursion(X.toCharArray(),
                Y.toCharArray(), m,
                n, dp));

        System.out.println(lcs(X.toCharArray(),
                Y.toCharArray(), m,
                n, 0));

        System.out.println(LCSubStr(X.toCharArray(),
                Y.toCharArray(), m,
                n));
    }

    //abac
//acac
    public static int LCSubString(char[] arr, char[] brr, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n ; j++) {
                if (arr[i - 1] == brr[j - 1])
                     dp[i][j] = 1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        return dp[m][n];
    }

    public static int lcsRecursion(char[] arr, char[] brr, int n, int m, int[][] dp) {
        if(n == 0 || m == 0) {
            return dp[n][m] = 0;
        }
        if(dp[n][m] != -1) {
            return dp[n][m];
        }
        if(arr[n - 1] == brr[m - 1]) {
            dp[n][m] = 1 + lcsRecursion(arr, brr, n - 1, m-1, dp);
        }
        int left = lcsRecursion(arr, brr, n - 1, m, dp);
        int right = lcsRecursion(arr, brr, n, m - 1, dp);
        return dp[n][m] = Math.max(dp[n][m], Math.max(left, right));
    }

    private static int lcs(char[] a, char[] b, int i, int j, int count) {
        if (i == 0 || j == 0)
            return count;
        if (a[i - 1] == b[j - 1]) {
            count = lcs(a, b, i - 1, j - 1, count + 1);
        }
        count = Math.max(count, Math.max(lcs(a, b, i, j - 1, 0), lcs(a, b, i - 1, j, 0)));
        return count;
    }
    public static int LCSubStr(char[] X, char[] Y, int n, int m) {
        int t1[][] = new int[n + 1][m + 1];
        //initalization can be ommited as by default arr is initialized to 0
        //    GeeksForGeeks.Arrays.fill(t1[0], -1);
        //    for (int i=0; i< m+1; i++) {
        //        t[0][i] = 0;
        //    }
        int result = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
               if (Y[j - 1] == X[i - 1]) {
                    t1[i][j] = 1 + t1[i - 1][j - 1];
                    result = Math.max(result, t1[i][j]);
                } else {
                    t1[i][j] = 0;
                }
            }
        }
        PrintMatrix.printMatrix(t1);
        return result;
    }
}
