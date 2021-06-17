package GeeksForGeeks.Arrays.Matrix;

import GeeksForGeeks.Arrays.PrintMatrix;

/**
 *
 */

public class PrintSpiralCounterClockwise {

    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        PrintMatrix.printMatrix(arr);
        printSpiralCounterClockwise(4, 4, arr);
    }

    public static void printSpiralCounterClockwise(int rowLength, int colLength, int[][] arr) {
        int rowBegin = 0, colBegin = 0;
        while (rowBegin < rowLength && colBegin < colLength) {
            if (rowBegin + 1 == rowLength && colBegin + 1 == colLength) {
                break;
            }
            for (int i = rowBegin; i < rowLength; i++) {
                System.out.print(arr[i][colBegin] + "   ");

            }
            colBegin++;

            for (int i = colBegin; i < colLength; i++) {
                System.out.print(arr[rowLength - 1][i] + "   ");

            }

            rowLength--;

            for (int i = rowLength - 1; i >= rowBegin; i--) {
                System.out.print(arr[i][colLength - 1] + "   ");

            }
            colLength--;


            for (int i = colLength - 1; i >= colBegin; i--) {
                System.out.print(arr[rowBegin][i] + "   ");

            }
            rowBegin++;

        }
    }
}
