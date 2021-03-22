package DynamicProgramming.LCS;
/**
 *
 */

import Arrays.PrintMatrix;

import java.util.Arrays;

public class Q1LCS {
    static int t[][] = new int[7][8];

    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";
        char[] X = s1.toCharArray();
        char[] Y = s2.toCharArray();
        int n = X.length;
        int m = Y.length;
        System.out.println("Length of LCS is" + " " +
                lcs(X, Y, n, m));
        System.out.println();
        //Memoization
        System.out.println("Length of LCS by memoization" + " " +
                lcsMemoization(X, Y, n, m));
        PrintMatrix.printMatrix(t);
        //Top Down
        System.out.println();
        System.out.println("Length of LCS by TopDown" + " " +
                lcsTopDown(X, Y, n, m));
    }

    // Recursive solution to solve lcs
    public static int lcs(char[] arr, char[] brr, int n, int m) {
        if (m == 0 || n == 0) {
            return 0;
        }
        if (brr[m - 1] == arr[n - 1]) {
            return 1 + lcs(arr, brr, n - 1, m - 1);
        } else {
            return Math.max(lcs(arr, brr, n, m - 1),
                    lcs(arr, brr, n - 1, m));
        }
    }

    public static int lcsMemoization(char[] arr, char[] brr, int n, int m) {
        for (int[] array : t)
            Arrays.fill(array, -1);   //  initilization
        if (m == 0 || n == 0) return 0;
        if (arr[n - 1] == brr[m - 1]) {
            return t[n][m] = 1 + lcsMemoization(arr, brr, n - 1, m - 1);
        } else {
            return t[n][m] = Math.max(lcsMemoization(arr, brr, n - 1, m),
                    lcsMemoization(arr, brr, n, m - 1));
        }

    }

    public static int lcsTopDown(char[] arr, char[] brr, int n, int m) {
        int t1[][] = new int[n + 1][m + 1];
        //initalization can be ommited as by default arr is initialized to 0
        //    Arrays.fill(t1[0], -1);
        //    for (int i=0; i< m+1; i++) {
        //        t[0][i] = 0;
        //    }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 0 || j == 0) {
                    t1[i][j] = 0;
                }
                if (arr[i - 1] == brr[j - 1]) {
                    t1[i][j] = 1 + t[i - 1][j - 1];
                } else {
                    t1[i][j] = Math.max(t1[i - 1][j], t1[i][j - 1]);
                }
            }
        }
        PrintMatrix.printMatrix(t1);
        return t[n][m];
    }
}
