package GeeksForGeeks.Arrays.Matrix;

import java.util.Arrays;

/**
 *We are given a row-wise sorted matrix of size r*c, we need to find the median of the matrix given. It is assumed that r*c is always odd.
 * Examples:
 *
 * Input : 1 3 5
 *         2 6 9
 *         3 6 9
 * Output : Median is 5
 * If we put all the values in a sorted
 * array A[] = 1 2 3 3 5 6 6 9 9)
 *
 * Input: 1 3 4
 *        2 5 6
 *        7 8 9
 * Output: Median is 5
 */

public class MedianOfMatrix {

    public static void main(String[] args) {
        int r = 3, c = 3;
        int[][] arr = {{1, 3, 5}, {2, 6, 9}, {3, 6, 9}};
        System.out.println(binaryMedian(arr));
    }

    public static int binaryMedian(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int[] newArr = new int[m * n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                newArr[k] = arr[i][j];
                k++;
            }
        }
        Arrays.sort(newArr);
        return newArr[newArr.length / 2];
    }
}
