package Arrays.Matrix;

/**
 *
 */

public class SquaresMatrixDiagonal {

    public static void main(String[] args) {
        int arr[][] = {{2, 5, 7},
                {3, 7, 2},
                {5, 6, 9}};
        diagonalsquare(arr);
    }

    public static void diagonalsquare(int arr[][]) {

        System.out.println("Diagonal One");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][i] * arr[i][i]+ "       ");
        }
        System.out.println();
        System.out.println("Diagonal Two");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][arr.length - i - 1] * arr[i][arr.length - i -1] + "       ");
        }

    }
}
