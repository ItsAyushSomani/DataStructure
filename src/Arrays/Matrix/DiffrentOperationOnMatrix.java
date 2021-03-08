package Arrays.Matrix;

/**
 *
 */

public class DiffrentOperationOnMatrix {

    public static void main(String[] args) {
        int arr[][] = {
                {2, 5},
                {1, 7}
        };
        int brr[][] = {
                {3, 7},
                {2, 9}
        };

        PrintMatrix.printMatrix(DiffrentOperationMatrix(arr, brr, "add"));
        PrintMatrix.printMatrix(DiffrentOperationMatrix(arr, brr, "subs"));
        PrintMatrix.printMatrix(DiffrentOperationMatrix(arr, brr, "multiply"));

    }

    public static int[][] DiffrentOperationMatrix(int arr[][], int brr[][], String Operation) {
        int[][] crr = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (Operation.equals("add"))
                    crr[i][j] = arr[i][j] + brr[i][j];
                if (Operation.equals("subs"))
                    crr[i][j] = arr[i][j] - brr[i][j];
                if (Operation.equals("multiply")) {
                    for (int k = 0; k < arr[0].length; k++) {
                        crr[i][j] += arr[i][k] * brr[k][j];
                    }
                }

            }
        }
        return crr;
    }
}

