package GeeksForGeeks.Arrays.Matrix;

import java.util.Arrays;

/**
 *
 */

public class SortMatrix {

    public static void main(String[] args) {
        int arr[][] = {{5, 4, 7},
                {1, 3, 8},
                {2, 9, 6}};
        int n = 3;

        System.out.println("Original Matrix:");
        printMat(arr, n);

        sortMatrix(arr);

        System.out.println("Matrix After Sorting:");
        printMat(arr, n);
    }

    private static void printMat(int mat[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(mat[i][j] + " ");
            System.out.println();
        }
    }

    public static void sortMatrix(int[][] arr) {
        int n = arr.length;
        int[] newArr = new int[n * n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                newArr[k] = arr[i][j];
                k++;
            }
        }
        Arrays.sort(newArr);
        k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = newArr[k];
                k++;
            }
        }

    }
}
