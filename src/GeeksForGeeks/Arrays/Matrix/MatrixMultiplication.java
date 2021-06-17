package GeeksForGeeks.Arrays.Matrix;

/**
 *
 */

public class MatrixMultiplication {

    public static void main(String[] args) {
        int arr[][] = { {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        int brr[][] = { {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

       int[][] k = multiplyMatrix(arr, brr);
       for (int i=0; i< k.length; i++) {
           for (int j =0; j< k[0].length; j++) {
               System.out.println(k[i][j]);
               System.out.print("    ");
           }
           System.out.println();
       }


    }

    public static int[][] multiplyMatrix(int[][] arr, int[][]brr) {
        int [][] newArr = new int[arr.length][brr[0].length];

        for (int i=0; i< arr.length; i++){
            for (int j=0; j< arr.length; j++){
                int sum=0;
                for (int k=0; k< brr.length; k++) {
                    sum += arr[i][k] * brr[k][j];
                }
                newArr[i][j] = sum;
            }
        }
        return newArr;
    }
}
