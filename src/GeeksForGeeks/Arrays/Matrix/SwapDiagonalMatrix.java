package GeeksForGeeks.Arrays.Matrix;

import GeeksForGeeks.Arrays.PrintMatrix;

/**
 *
 */

public class SwapDiagonalMatrix {

    public static void main(String[] args) {
        int arr[][] = {{0, 1, 2},
                {3, 4, 5},
                {6, 7, 8}};
        PrintMatrix.printMatrix(arr);
        swapDiagonal(arr);
        System.out.println("----updated matrix----");
        PrintMatrix.printMatrix(arr);
    }

    public static void swapDiagonal(int arr[][]) {

        int n = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i][i];
            arr[i][i] = arr[i][n - i];
            arr[i][n-i] = temp;
        }
    }
}
