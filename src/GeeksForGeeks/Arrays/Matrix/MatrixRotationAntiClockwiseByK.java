package GeeksForGeeks.Arrays.Matrix;

import GeeksForGeeks.Arrays.PrintMatrix;

/**
 *
 */

public class MatrixRotationAntiClockwiseByK {

    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        int k = 4;

        System.out.println("----orignal matrix");
        PrintMatrix.printMatrix(arr);
        spiralRotate(arr, k);
        System.out.println("----updated matrix----");
        PrintMatrix.printMatrix(arr);
    }

    public static void spiralRotate(int[][] arr, int k) {
        int[] newArr = new int[arr.length * arr[0].length];
        int rowBegin = 0, rowLength = arr.length - 1;
        int colBegin = 0, colLength = arr[0].length - 1;
        int count = 0;
        while (rowBegin < rowLength && colBegin < colLength) {
            int start = count;
             for (int i = colBegin; i <= colLength; i++) {
                newArr[count] = arr[rowLength][i];
                count++;
            }
            rowLength--;


            for (int i = rowLength; i >= rowBegin; i--) {
                newArr[count] = arr[i][colLength];
                count++;
            }
            colLength--;


            for (int i = colLength; i >= colBegin; i--) {
                newArr[count] = arr[rowBegin][i];
                count++;
            }
            rowBegin++;

            for (int i = rowBegin; i <= rowLength; i++) {
                newArr[count] = arr[i][colBegin];
                count++;
            }
            colBegin++;

            for (int ar : newArr) {
                System.out.print(ar + "   ");
            }
            System.out.println();
            if (count-start > k) {
                reverse(newArr, start, count - 1);
                reverse(newArr, start, start + k - 1);
                reverse(newArr, start + k, count - 1);
                reverse(newArr, start, count - 1);
            }
            for (int ar : newArr) {
                System.out.print(ar + "   ");
            }
        }

        System.out.println();

        System.out.println();
        fillSpiralMatrix(arr, newArr);
    }

    public static void fillSpiralMatrix(int[][] arr, int[] newArr) {
        int rowBegin = 0, rowLength = arr.length - 1;
        int colBegin = 0, colLength = arr[0].length - 1;
        int count = 0;
        while (rowBegin < rowLength && colBegin < colLength) {

            for (int i = colBegin; i <= colLength; i++) {
                arr[rowLength][i] = newArr[count];
                count++;
            }
            rowLength--;


            for (int i = rowLength; i >= rowBegin; i--) {
                arr[i][colLength] = newArr[count];
                count++;
            }
            colLength--;


            for (int i = colLength; i >= colBegin; i--) {
                arr[rowBegin][i] = newArr[count];
                count++;
            }
            rowBegin++;

            for (int i = rowBegin; i <= rowLength; i++) {
                arr[i][colBegin] = newArr[count];
                count++;
            }
            colBegin++;
        }
    }

    private static void reverse(int[] arr, int start, int end) {
        int mid = (end - start) / 2;
        for (int i = 0; i <= mid; i++) {
            int temp = arr[start + i];
            arr[start + i] = arr[end - i];
            arr[end - i] = temp;
        }
    }
}
