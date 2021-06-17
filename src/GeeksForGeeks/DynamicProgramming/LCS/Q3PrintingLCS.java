package GeeksForGeeks.DynamicProgramming.LCS;
/**
 *
 */

import GeeksForGeeks.Arrays.PrintMatrix;

public class Q3PrintingLCS {

    public static void main(String[] args) {
        String X = "AGTGATG";
        String Y = "GTTAG";
        int m = X.length();
        int n = Y.length();
        printLCS(X.toCharArray(), Y.toCharArray(), m, n);

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
