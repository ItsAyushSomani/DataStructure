package GeeksForGeeks.Arrays.Matrix;

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

    public static void rotatematrix(int rowEnd, int colEnd, int[][] arr) {
        int rowBegin = 0, colBegin = 0;
        int prev, curr;
        while (rowBegin < rowEnd && colBegin < colEnd) {
            if (rowBegin + 1 == rowEnd && colBegin + 1 == colEnd) {
                break;
            }
            prev = arr[rowBegin + 1][colBegin];

            for (int i = colBegin; i < colEnd; i++) {
                curr = arr[rowBegin][i];
                arr[rowBegin][i] = prev;
                prev = curr;
            }
            rowBegin++;


            for (int i = rowBegin; i < rowEnd; i++) {
                curr = arr[i][colEnd - 1];
                arr[i][colEnd - 1] = prev;
                prev = curr;
            }
            colEnd--;

            if (rowBegin < rowEnd) {
                for (int i = colEnd - 1; i >= colBegin; i--) {
                    curr = arr[rowEnd - 1][i];
                    arr[rowEnd - 1][i] = prev;
                    prev = curr;
                }
            }
            rowEnd--;

            if (colBegin < colEnd) {
                for (int i = rowEnd - 1; i >= rowBegin; i--) {
                    curr = arr[i][colBegin];
                    arr[i][colBegin] = prev;
                    prev = curr;
                }
            }
            colBegin++;
        }
    }
}

