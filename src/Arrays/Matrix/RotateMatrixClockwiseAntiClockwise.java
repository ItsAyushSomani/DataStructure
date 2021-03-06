package Arrays.Matrix;

/**
 *
 */

public class RotateMatrixClockwiseAntiClockwise {

    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};


        rotateAntiClockwiseWithoutExtraspace(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }

    }

    public static int[][] rotateClockwise(int[][] arr) {
        int[][] brr = new int[arr.length][arr[0].length];
        for (int i = 2, k = 0; i >= 0; i--, k++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = arr[j][i];
            }
        }
        return arr;
    }


    public static int[][] rotateClockwiseWithoutExtraspace(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        int n = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length / 2; j++) {
                int temp = arr[i][n - j];
                arr[i][n - j] = arr[i][j];
                arr[i][j] = temp;
            }
        }

        return arr;
    }


    public static void rotateAntiClockwiseWithoutExtraspace(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[i].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        int n = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < (arr.length / 2); j++) {
                int temp = arr[n - j][i];
                arr[n - j][i] = arr[j][i];
                arr[j][i] = temp;
            }
        }

    }

}
