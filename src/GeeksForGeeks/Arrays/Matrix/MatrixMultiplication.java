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
        SpiralMatrix(arr);
       int[][] k = multiplyMatrix(arr, brr);
       for (int i=0; i< k.length; i++) {
           for (int j =0; j< k[0].length; j++) {
               System.out.print(k[i][j]);
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

    public static void SpiralMatrix(int[][] arr) {
        int beginRow = 0;
        int beginCol = 0;
        int endRow = arr.length - 1;
        int endCol = arr[0].length - 1;

        while(beginCol <= endCol && beginRow <= endRow) {

            for(int i = beginCol; i <= endCol; i++) {
                System.out.print(arr[beginRow][i]);
            }
            beginRow++;

            for(int i = beginRow; i <= endRow; i++) {
                System.out.print(arr[i][endCol]);
            }
            endCol--;

            for(int i = endCol; i >= beginCol; i--) {
                System.out.print(arr[endRow][i]);
            }
            endRow--;

            for(int i = endRow; i >= beginRow; i--) {
                System.out.print(arr[i][beginCol]);
            }
            beginCol++;
        }
        System.out.println();
    }
}
