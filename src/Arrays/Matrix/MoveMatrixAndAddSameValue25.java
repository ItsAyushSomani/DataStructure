package Arrays.Matrix;

import Arrays.PrintMatrix;

/**
 * Given a matrix m[ ][ ] of size n x n consisting of integers and given a character ‘x’ indicating the direction. Value of ‘x’ can be ‘u’, ‘d’, ‘l’, ‘r’ indicating Up, Down, Left, Right correspondingly. The task is to move the element to given direction such that the consecutive elements having same value are added into single value and shift the rest element. Also, shift the element if the next element in given direction is 0.
 * For example :
 * Consider x = ‘l’ and matrix m[][],
 * 32 3 3
 * 0 0 1
 * 10 10 8
 * After adding 3 in first row, 10 in third row and moving 1 in second row,
 * Matrix will become
 * 32 6 0
 * 1 0 0
 * 20 8 0
 * Examples :
 * <p>
 * <p>
 * Input : x = 'l'
 * m[][] = { { 32, 3, 3, 3, 3 },
 * { 0, 0, 1, 0, 0 },
 * { 10, 10, 8, 1, 2},
 * { 0, 0, 0, 0, 1},
 * { 4, 5, 6, 7, 8 } }
 * Output :
 * 32 6 6 0 0
 * 1 0 0 0 0
 * 20 8 1 2 0
 * 1 0 0 0 0 0
 * 4 5 6 7 8
 * <p>
 * Input : x = 'u'
 * m[][] = { { 10, 3, 32 },
 * { 10, 0, 96 },
 * { 5, 32, 96 } }
 * Output :
 * 20 3 32
 * 5 32 192
 * 0 0 0
 */

public class MoveMatrixAndAddSameValue25 {

    public static void main(String[] args) {
        int arr[][] = {
                {32, 0, 3, 3, 3},
                {3, 0, 1, 0, 0},
                {3, 0, 8, 1, 2},
                {3, 1, 0, 0, 1},
                {3, 0, 6, 7, 8}
        };

        char d = 'u';
        moveMatrix(arr, d);
        PrintMatrix.printMatrix(arr);
    }

    public static void moveMatrix(int arr[][], char d) {
        switch (d) {
            case 'l':
                moveMatrixLeft(arr);
                break;
            case 'r':
                moveMatrixRight(arr);
                break;
            case 'u':
                moveMatrixUpper(arr);
                break;
            case 'd':
                moveMatrixDown(arr);
                break;
        }
    }

    private static void moveMatrixDown(int[][] arr) {

    }

    private static void moveMatrixUpper(int[][] arr) {
        int rowLen = arr.length;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < rowLen - 1; j++) {
                if (arr[j][i] != 0 && arr[j][i] == arr[j + 1][i]) {
                    arr[j + 1][i] *= 2;
                    arr[j][i] = 0;
                    if (j > 0) {
                        rotateTopByColumn(arr, i, j);
                    }
                } else if (arr[j + 1][i] == 0) {
                    int temp = arr[j][i];
                    arr[j][i] = arr[j + 1][i];
                    arr[j + 1][i] = temp;
                }
            }
        }
    }

    private static void moveMatrixRight(int[][] arr) {
        int rowLen = arr.length;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < rowLen - 1; j++) {
                if (arr[i][j] != 0 && arr[i][j] == arr[i][j + 1]) {
                    arr[i][j + 1] *= 2;
                    arr[i][j] = 0;
                    if (j > 0) {
                        rightRotate(arr[i], j);
                    }
                } else if (arr[i][j + 1] == 0) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[i][j + 1];
                    arr[i][j + 1] = temp;
                }
            }
        }
    }

    public static void moveMatrixLeft(int arr[][]) {
        int rowLen = arr.length;
        int colLen = arr.length;
        for (int i = 0; i < arr.length; i++) {
            for (int j = rowLen - 1; j > 0; j--) {
                if (arr[i][j] != 0 && arr[i][j] == arr[i][j - 1]) {
                    arr[i][j - 1] *= 2;
                    arr[i][j] = 0;
                    if (j < rowLen - 1) {
                        leftRotate(arr[i], j);
                    }
                } else if (arr[i][j - 1] == 0) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[i][j - 1];
                    arr[i][j - 1] = temp;
                }
            }
        }
    }


    private static void leftRotate(int[] arr, int start) {
        reverse(arr, start, 0);
        reverse(arr, start + 1, arr.length - 1);
        reverse(arr, start, arr.length - 1);
    }

    private static void rightRotate(int[] arr, int end) {
        reverse(arr, 0, end);
        reverse(arr, 0, 0);
        reverse(arr, 1, end);
    }

    private static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    private static void rotateTopByColumn(int[][] arr, int columnIndex, int end) {
        int t = arr[0][columnIndex];
        int i = 0;
        for (i = 0; i < end; i++) {
            arr[i][columnIndex] = arr[i + 1][columnIndex];
        }
        arr[i][columnIndex] = t;
    }


}
