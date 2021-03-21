package Arrays;

/**
 *
 */

public class PrintMatrix {

    public static void printMatrix(int[][] arr) {
        for (int[] ints : arr) {
            for (int j = 0; j < arr[0].length;
                 j++)
                System.out.print(ints[j] + " ");
            System.out.println("");
        }
    }

    public static void printBooleanMatrix(boolean[][] arr) {
        for (boolean[] bool : arr) {
            for (int j = 0; j < arr[0].length;
                 j++)
                System.out.print(bool[j] + " ");
            System.out.println("");
        }
    }
}
