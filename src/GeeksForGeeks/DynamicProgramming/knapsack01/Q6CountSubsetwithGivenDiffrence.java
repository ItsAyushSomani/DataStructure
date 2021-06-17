package GeeksForGeeks.DynamicProgramming.knapsack01;
/**
 *
 */

import java.util.Arrays;

public class Q6CountSubsetwithGivenDiffrence {

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 3};
        int n = arr.length;
        int k = 1;
        int sumOfAllElementsInArray = Arrays.stream(arr).sum();
        System.out.println("The minimum difference between 2 sets is "
                + findMin(arr, n, (sumOfAllElementsInArray - k) / 2));
    }

    public static int findMin(int[] arr, int n, int sum) {
        int t[][] = new int[n + 1][sum + 1];
        Arrays.fill(t[0], 0);
        for (int i = 0; i <= arr.length; i++) {
            t[i][0] = 1;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (arr[i - 1] <= j) {
                    t[i][j] = t[i - 1][j - arr[i - 1]] + t[i - 1][j];
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        return t[n][sum];
    }
}
