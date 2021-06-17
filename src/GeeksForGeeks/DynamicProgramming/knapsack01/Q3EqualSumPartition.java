package GeeksForGeeks.DynamicProgramming.knapsack01;
/**
 *
 */

public class Q3EqualSumPartition {

    public static void main(String[] args) {
        int arr[] = {1, 3, 3, 2, 3, 10, 20};
        int n = arr.length;
        if (findPartition(arr, n) == true)
            System.out.println(
                    "Can be divided into two subsets of equal sum");
        else
            System.out.println(
                    "Can not be divided int0 two subsets of equal sum");
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

    public static boolean findPartition(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        if (sum % 2 != 0) {
            return false;
        }
        return isSubsetSum(arr, n, sum / 2);
    }
}
