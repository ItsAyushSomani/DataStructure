package GeeksForGeeks.DynamicProgramming.UnboundedKnapsack;
/**
 *
 */

public class Q1UnboundedKnapsack {
    static int[][] t = new int[4][51];

    public static void main(String[] args) {
        int W = 100;
        int val[] = {10, 30, 20};
        int wt[] = {5, 10, 15};
        int n = val.length;
//        System.out.println("Simple Recursion");
//        System.out.println(knapSack(wt, val, W, n));
//        System.out.println("Memoization");
//        System.out.println(knapSackMemo(wt, val, W, n));
        System.out.println("Top Down");
        System.out.println(knapSackTopDown(wt, val, W, n));
    }

    //Normal Recursive function
    public static int knapSack(int[] wt, int[] val, int W, int n) {
        if (n == 0 || W == 0) {
            return 0;
        }
        if (wt[n - 1] <= W) {
            return Math.max(val[n - 1] + knapSack(wt, val, W - wt[n - 1], n), knapSack(wt, val, W, n - 1));
        } else {
            return knapSack(wt, val, W, n - 1);
        }
    }

    static int knapSackMemo(int wt[], int val[], int W, int N) {
        // Loop to initially filled the
        // table with -1
        for (int i = 0; i < t.length; i++)
            for (int j = 0; j < t[0].length; j++)
                t[i][j] = -1;
        return knapSackMemoization(wt, val, W, N);
    }

    //Memoization Recursive function
    public static int knapSackMemoization(int[] wt, int[] val, int W, int n) {
        if (n == 0 || W == 0) {
            return 0;
        }
        if (t[n][W] != -1) {
            return t[n][W];
        }
        if (wt[n - 1] <= W) {
            return t[n][W] = Math.max(val[n - 1] + knapSack(wt, val, W - wt[n - 1], n), knapSack(wt, val, W, n - 1));
        } else {
            return t[n][W] = knapSack(wt, val, W, n - 1);
        }
    }

    //Top Down approach
    public static int knapSackTopDown(int[] wt, int[] val, int W, int n) {
        int i, j;
        int t[][] = new int[n + 1][W + 1];
        for (i = 0; i <= n; i++) {
            for (j = 0; j <= W; j++) {
                if (i == 0 || j == 0) {
                    t[i][j] = 0;
                } else if (wt[i - 1] <= j) {
                    t[i][j] = Math.max(val[i - 1] + t[i][j - wt[i - 1]], t[i - 1][j]);
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }

        }
        return t[n][W];
    }
}
