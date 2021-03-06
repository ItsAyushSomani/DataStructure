package Arrays.Matrix;

/**
 *
 */

public class MatrixRotation {

    public static void main(String[] args) {
        // Test Case 1
//        int arr[][] = {{1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}};
        //test case2
        int arr[][] = { {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16} };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.print("\n");
        }
        rotatematrix(arr.length, arr[0].length, arr);
        System.out.println();
        System.out.println("-------------------------------------");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.print("\n");
        }

    }

    public static void rotatematrix(int maxRow, int maxCol, int[][] arr) {
        int row = 0, col = 0;
        int prev, curr;
        while (row < maxRow && col < maxCol) {
            if (row + 1 == maxRow && col + 1 == maxCol) {
                break;
            }
            prev = arr[row + 1][col];

            for (int i = col; i < maxCol; i++) {
                curr = arr[row][i];
                arr[row][i] = prev;
                prev = curr;
            }
            row++;


            for (int i = row; i < maxRow; i++) {
                curr = arr[i][maxCol - 1];
                arr[i][maxCol - 1] = prev;
                prev = curr;
            }
            maxCol--;

            if (row < maxRow) {
                for (int i = maxCol - 1; i >= col; i--) {
                    curr = arr[maxRow - 1][i];
                    arr[maxRow - 1][i] = prev;
                    prev = curr;
                }
            }
            maxRow--;

            if (col < maxCol) {
                for (int i = maxRow - 1; i >= row; i--) {
                    curr = arr[i][col];
                    arr[i][col] = prev;
                    prev = curr;
                }
            }
            col++;
        }
    }
}

