package GeeksForGeeks.Arrays.Matrix;

/**
 *
 */

public class MaximumElementEachRowMatrix {

    public static void main(String[] args) {
        int arr[][] = { {3, 4, 1, 8},
            {1, 4, 9, 11},
            {76, 34, 21, 1},
            {2, 1, 4, 5} };
        // Calling the function
        printMaxElementEachRow(arr);
    }

    public static void printMaxElementEachRow(int arr[][]) {
        for (int i=0; i< arr.length; i++) {
            int max = arr[i][0];
            for(int j=1; j< arr[0].length; j++) {
                max = Math.max(max, arr[i][j]);
            }
            System.out.println(String.format("Max Element for row ${1}", i) + "is" + max);
        }

    }
}
