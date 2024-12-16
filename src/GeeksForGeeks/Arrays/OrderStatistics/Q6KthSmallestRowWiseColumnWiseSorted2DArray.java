package GeeksForGeeks.Arrays.OrderStatistics;
/**
 *
 */

import java.util.Arrays;

public class Q6KthSmallestRowWiseColumnWiseSorted2DArray {

    public static void main(String[] args) {
        int mat[][] = {{10, 20, 30, 40},
                {15, 25, 35, 45},
                {25, 29, 37, 48},
                {32, 33, 39, 50}};
        int k = 7;
        int res = kthSmallest(mat, k);
        System.out.print("7th smallest element is " + res);
    }

    public static int kthSmallest(int[][] arr, int k) {
        int[] tempArray = new int[arr.length * arr[0].length];
        for (int i = 0, s = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                tempArray[s] = arr[i][j];
                s++;
            }
        }
        Arrays.sort(tempArray);
        return tempArray[k - 1];
    }
}
