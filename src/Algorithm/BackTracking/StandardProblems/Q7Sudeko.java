package Algorithm.BackTracking.StandardProblems;

import GeeksForGeeks.Arrays.PrintMatrix;

/**
 *
 */
public class Q7Sudeko {

    public static void main(String[] args) {

        int grid[][] = {
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };
        PrintMatrix.printMatrix(grid);
        System.out.println("=================================================");
        if (solveSuduko(grid, 0, 0))
            PrintMatrix.printMatrix(grid);
        else
            System.out.println("No Solution exists");
    }

    private static boolean solveSuduko(int[][] grid, int row, int col) {
        if (row == 8 && col == 9) {
            return true;
        }
        if (col > 8) {
            row++;
            col = 0;
        }
        if (grid[row][col] != 0) return solveSuduko(grid, row, col + 1);
        for (int i = 1; i <= 9; i++) {
            if (isSudekoSafe(grid, row, col, i)) {
                grid[row][col] = i;
                if (solveSuduko(grid, row, col + 1)) {
                    return true;
                }
            }
            grid[row][col] = 0;
        }
        return false;
    }

    private static boolean isSudekoSafe(int[][] grid, int row, int col, int num) {
        for (int i = 0; i < 9; i++) {
            if (grid[row][i] == num) {
                return false;
            }
        }
        for (int i = 0; i < 9; i++) {
            if (grid[i][col] == num) {
                return false;
            }
        }
        int sqrt = (int)Math.sqrt(grid.length);
        int boxRowStart = row - row % sqrt;
        int boxColStart = col - col % sqrt;

        for (int r = boxRowStart;
             r < boxRowStart + sqrt; r++)
        {
            for (int d = boxColStart;
                 d < boxColStart + sqrt; d++)
            {
                if (grid[r][d] == num)
                {
                    return false;
                }
            }
        }

        return true;
    }
}
