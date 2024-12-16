package Algorithm.BackTracking.StandardProblems;


/**
 *
 */
public class Q3NQueen {

    public static void main(String[] args) {
//        int board[][] = {{0, 0, 0, 0},
//                {0, 0, 0, 0},
//                {0, 0, 0, 0},
//                {0, 0, 0, 0}};
        int board[][] = {{0, 0, 0},
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0, 0}};
        if (solveNQUtil(board, 0) == false) {
            System.out.print("Solution does not exist");
        } else {
            System.out.println("Solution Exist");
        }
    }

    private static boolean solveNQUtil(int[][] board, int col) {
        if (col >= board.length) {
            return true;
        }
        for (int i = 0; i < board.length; i++) {
            if (is_Safe(board, i, col)) {
                board[i][col] = 1;
                if (solveNQUtil(board, col + 1)) {
                    return true;
                }
                board[i][col] = 0;
            }

        }
        return false;
    }

    private static boolean is_Safe(int[][] board, int row, int col) {
        for (int i = col; i >= 0; i--) {
            if (board[row][i] == 1) {
                return false;
            }
        }
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        for (int i = row, j = col; i < board.length && j >= 0; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        return true;
    }
}
