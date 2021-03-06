package Arrays.Matrix;

/**
 *
 */

public class RectangleMatrixClockwise {

    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}};
        rotateClockwise(arr);
    }

    public static int[][] rotateClockwise(int[][] arr) {
        int[][] brr = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = arr.length-1; j >= 0; j--) {
//                arr[i][j] = arr[j][i];
                System.out.print(arr[j][i]);
            }
            System.out.println();
        }
        return arr;
    }

}
