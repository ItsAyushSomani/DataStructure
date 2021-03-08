package Arrays.Matrix;

/**
 *
 */

public class ShiftMatrixRowWise {

    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        int k = 2;

        // Function call
        shiftMatrixByK(arr, k);
        PrintMatrix.printMatrix(arr);
    }

    public static void shiftMatrixByK(int arr[][], int k) {
        for (int i = 0; i < arr[0].length; i++) {
            reverse(arr[i], 0, k-1);
            reverse(arr[i], k, arr[0].length-1);
            reverse(arr[i], 0, arr[0].length-1);

        }
    }


    public static void reverse(int[] a, int start, int end) {
        int n = (end - start)/ 2;
        for (int i = 0; i <= n; i++) {
            int temp = a[start + i];
            a[start + i] = a[end - i];
            a[end - i] = temp;
        }
    }
}
