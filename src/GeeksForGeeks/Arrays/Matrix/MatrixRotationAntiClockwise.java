package GeeksForGeeks.Arrays.Matrix;

/**
 *
 */

public class MatrixRotationAntiClockwise {

    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.print("\n");
        }
        System.out.println("---------------------------------------------");
        System.out.println();
        rotatematrix(arr.length, arr[0].length, arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.print("\n");
        }
    }

    public static void rotatematrix(int rowLength, int colLength, int[][] arr) {
        int rowBegin = 0, colBegin = 0;
        int prev;
        while (rowBegin < rowLength && colBegin < colLength) {
            if (rowBegin + 1 == rowLength && colBegin + 1 == colLength) {
                break;
            }
            prev = arr[rowLength - 1][colBegin];

            for (int i = colBegin; i < colLength; i++) {
                int curr = arr[rowLength - 1][i];
                arr[rowLength - 1][i] = prev;
                prev = curr;
            }

            rowLength--;

            for (int i = rowLength - 1; i >= rowBegin; i--) {
                int curr = arr[i][colLength - 1];
                arr[i][colLength - 1] = prev;
                prev = curr;
            }
            colLength--;


            for (int i = colLength - 1; i >= colBegin; i--) {
                int curr = arr[rowBegin][i];
                arr[rowBegin][i] = prev;
                prev = curr;
            }
            rowBegin++;

            for (int i = rowBegin; i <= rowLength; i++) {
                int curr = arr[i][colBegin];
                arr[i][colBegin] = prev;
                prev = curr;
            }
            colBegin++;
        }
    }
}
