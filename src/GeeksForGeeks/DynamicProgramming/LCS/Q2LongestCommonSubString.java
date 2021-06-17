package GeeksForGeeks.DynamicProgramming.LCS;
/**
 *
 */

import GeeksForGeeks.Arrays.PrintMatrix;

public class Q2LongestCommonSubString {

    public static void main(String[] args) {
        String X = "OldSite:GeeksforGeeks.org";
        String Y = "NewSite:GeeksQuiz.com";
        int m = X.length();
        int n = Y.length();
        System.out.println(LCSubStr(X.toCharArray(),
                Y.toCharArray(), m,
                n));
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
                if (i == 0 || j == 0) {
                    t1[i][j] = 0;
                } else if (Y[j - 1] == X[i - 1]) {
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
