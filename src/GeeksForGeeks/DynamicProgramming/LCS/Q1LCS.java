package GeeksForGeeks.DynamicProgramming.LCS;
/**
 *We have discussed Overlapping Subproblems and Optimal Substructure properties in Set 1 and Set 2 respectively.
 *  We also discussed one example problem in Set 3. Let us discuss Longest Common Subsequence (LCS) problem as one more example problem that can be solved using Dynamic Programming.
 *
 * LCS Problem Statement: Given two sequences, find the length of longest subsequence present in both of them.
 * A subsequence is a sequence that appears in the same relative order, but not necessarily contiguous. For example, “abc”, “abg”, “bdf”, “aeg”, ‘”acefg”, .. etc are subsequences of “abcdefg”.
 *
 * In order to find out the complexity of brute force approach, we need to first know the number of possible
 * different subsequences of a string with length n, i.e., find the number of subsequences with lengths ranging
 * from 1,2,..n-1. Recall from theory of permutation and combination that number of combinations with 1 element
 * are nC1. Number of combinations with 2 elements are nC2 and so forth and so on.
 * We know that nC0 + nC1 + nC2 + … nCn = 2n. So a string of length n has 2n-1 different possible subsequences
 * since we do not consider the subsequence with length 0. This implies that the time complexity of the brute
 * force approach will be O(n * 2n). Note that it takes O(n) time to check if a subsequence is common to
 * both the strings. This time complexity can be improved using dynamic programming.
 *
 * It is a classic computer science problem, the basis of diff (a file comparison program that outputs the
 * differences between two files), and has applications in bioinformatics.
 *
 * Examples:
 * LCS for input Sequences “ABCDGH” and “AEDFHR” is “ADH” of length 3.
 * LCS for input Sequences “AGGTAB” and “GXTXAYB” is “GTAB” of length 4.
 */

import GeeksForGeeks.Arrays.PrintMatrix;

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
        //    GeeksForGeeks.Arrays.fill(t1[0], -1);
        //    for (int i=0; i< m+1; i++) {
        //        t[0][i] = 0;
        //    }
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
        return t1[n][m];
    }
}




