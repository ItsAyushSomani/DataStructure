package Arrays.Matrix;

/**
 *
 */

public class RowsWithMaximumOnes {

    public static void main(String[] args) {
        int arr[][] = {{0, 0, 0, 1},
                {1, 1, 1, 1},
                {0, 1, 1, 1},
                {0, 0, 0, 0}};
        System.out.println("Index of row with maximum 1s is "
                + rowWithMax1s(arr));
    }

    public static int rowWithMax1s(int[][] arr) {
        int max_row_index = 0, max=0;
        int n = arr[0].length;
        int i, index;
        for (i = 0; i < arr[0].length; i++) {
            index = binarySearch1s(arr[i], 0, n );
            if (index != -1 && n - index > max) {
                max = n - index;
                max_row_index = i;
            }
        }

        return max_row_index;
    }

    public static int binarySearch1s(int[] arr, int start, int end) {
        int mid = (start + end) / 2;
        while (start < end) {
            if ((mid == 0 || (arr[mid - 1] == 0)) && arr[mid] == 1){
                return mid;
            }
            if (arr[mid] == 0) {
               return binarySearch1s(arr, mid + 1, end);
            }
            return binarySearch1s(arr, 0, mid);
        }
        return 0;
    }
}

