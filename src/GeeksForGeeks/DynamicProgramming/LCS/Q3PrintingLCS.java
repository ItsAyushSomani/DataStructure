package GeeksForGeeks.DynamicProgramming.LCS;
/**
 *
 */

import GeeksForGeeks.Arrays.PrintMatrix;

import java.util.Arrays;

public class Q3PrintingLCS {

    public static void main(String[] args) {
        String X = "abcde";
        String Y = "acfeb";
        int m = X.length();
        int n = Y.length();
        String[][] dp = new String[m + 1][n + 1];
        printLCS(X.toCharArray(), Y.toCharArray(), m, n);
        System.out.println("lcsRecursion++" + new StringBuilder(lcsRecursion(X.toCharArray(), Y.toCharArray(), m, n, dp)).reverse());
        System.out.println("baba is here");
        lcsTab(X.toCharArray(), Y.toCharArray(), m, n, dp);
        for (String[] dpRow : dp) {
            System.out.println(Arrays.toString(dpRow));
        }
        System.out.println(new StringBuilder(dp[m][n]).reverse());
    }

    public static String lcsRecursion(char[] arr, char[] brr, int n, int m, String[][] dp) {
        if (n == 0 || m == 0) {
            String temp = "";

            if(n == 0) {
                while(m != 0) temp+=brr[m--];
            } else {
                while(n != 0) temp+=arr[n--];
            }
            return temp;
        }
        if (dp[n][m] != null) {
            return dp[n][m];
        }
        if (arr[n - 1] == brr[m - 1]) {
            return dp[n][m] = arr[n - 1] + lcsRecursion(arr, brr, n - 1, m - 1, dp);
        }
        String leftStr = lcsRecursion(arr, brr, n - 1, m, dp);
        String rightStr = lcsRecursion(arr, brr, n, m - 1, dp);
        return dp[n][m] = leftStr.length() >= rightStr.length() ? leftStr : rightStr;
    }

    public static void lcsTab(char[] arr, char[] brr, int n, int m, String[][] dp) {
        Arrays.fill(dp[0], "");
        for (int i = 0; i < dp[0].length; i++) {
            dp[i][0] = "";
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (arr[i - 1] == brr[j - 1]) {
                    dp[i][j] = arr[i - 1] + dp[i - 1][i - 1];
                } else {
                    String leftStr = dp[i - 1][j];
                    String rightStr = dp[i][j - 1];
                    dp[i][j] = leftStr.length() >= rightStr.length() ? leftStr : rightStr;
                }
            }
        }
    }

    public static void printLCS(char[] arr, char[] brr, int n, int m) {
        int t1[][] = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 0 || j == 0) {
                    t1[i][j] = 0;
                }
                if (arr[i - 1] == brr[j - 1]) {
                    t1[i][j] = 1 + t1[i - 1][j - 1];
                } else {
                    t1[i][j] = Math.max(t1[i - 1][j], t1[i][j - 1]);
                }
            }
        }
        PrintMatrix.printMatrix(t1);
        int i = n, j = m;
        StringBuilder s1 = new StringBuilder();
        while (i > 0 && j > 0) {
            if (arr[i - 1] == brr[j - 1]) {
                s1.append(arr[i - 1]);
                i--;
                j--;
            } else {
                if (t1[i][j - 1] > t1[i - 1][j]) {
                    j--;
                } else {
                    i--;
                }
            }
        }
        System.out.println(s1.reverse());
    }
}
