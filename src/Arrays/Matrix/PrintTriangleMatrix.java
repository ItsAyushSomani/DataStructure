package Arrays.Matrix;

/**
 *
 */

public class PrintTriangleMatrix {

    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int row = 3, col = 3;

        System.out.println("Lower triangular matrix: ");
        printLowerTriangle(arr);
        PrintMatrix.printMatrix(arr);
        int arr1[][] = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        System.out.println("Upper triangular matrix: ");
        printUpperTriangle(arr1);
        PrintMatrix.printMatrix(arr1);
    }

    public static void printUpperTriangle(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[0].length-1; j > i; j--) {
                arr[i][j] = 0;
            }
        }
    }

    public static void printLowerTriangle(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                arr[i][j] = 0;
            }
        }
    }
}
