package GeeksForGeeks.Arrays.Matrix;

/**
 *Given a matrix of n*n size, the task is to find whether all rows are circular rotations of each other or not.
 * Examples:
 *
 * Input: mat[][] = 1, 2, 3
 *                  3, 1, 2
 *                  2, 3, 1
 * Output:  Yes
 * All rows are rotated permutation
 * of each other.
 *
 * Input: mat[3][3] = 1, 2, 3
 *                    3, 2, 1
 *                    1, 3, 2
 * Output:  No
 * Explanation : As 3, 2, 1 is not a rotated or
 * circular permutation of 1, 2, 3
 */

public class AllRowCircularRotationsOfEachOther {

    public static void main(String[] args) {
        int n = 4;

        //Employee case 1
        int[][] arr = new int[][]{{1, 2, 3, 4},
                {4, 1, 2, 3},
                {3, 4, 1, 2},
                {2, 3, 4, 1}
        };
        if(isPermutedMatrix(arr, n)){
            System.out.println("Permuted");
        } else {
            System.out.println("not permuted");
        }
    }

    public static Boolean isPermutedMatrix(int[][] arr, int n) {
        StringBuilder s = new StringBuilder("");;
        String StringCopiedTwoTimes = null;
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < n; j++) {
                s.append(arr[i][j]);
            }
        }
        StringCopiedTwoTimes = s.append(s).toString();
        for (int i = 0; i < n; i++) {
            s = new StringBuilder("");
            for (int j = 0; j < n; j++) {
                s.append(arr[i][j]);
            }
            if (!StringCopiedTwoTimes.contains(s.toString())) return false;
        }
        return true;
    }
}
