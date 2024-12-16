package Algorithm.BackTracking.StandardProblems;

/**
 *
 */
public class Q2RatMaze {

    public static void main(String[] args) {
        int maze[][] = { { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 0, 0 },
                { 1, 1, 1, 1 } };


        solveMaze(maze);
    }

    private static boolean solveMaze(int[][] maze) {
        int sol[][] = new int[maze.length][maze.length];

        if (solveMazeUtil(maze, 0, 0, sol) == false) {
            System.out.print("Solution doesn't exist");
            return false;
        }
        System.out.println("solution exist");
//        printSolution(sol);
        return true;
    }

    private static boolean solveMazeUtil(int[][] maze, int row, int col, int[][] sol) {
        if(row == maze.length - 1 && col == maze.length-1) {
            return true;
        }
        if(isSafe(maze, row, col)) {
            maze[row][col] = 0;
            if (solveMazeUtil(maze, row + 1, col, sol))
                return true;

            /* If moving in x direction doesn't give
            solution then Move down in y direction */
            if (solveMazeUtil(maze, row, col + 1, sol))
                return true;

            /* If moving in y direction doesn't give
            solution then Move backwards in x direction */
            if (solveMazeUtil(maze, row - 1, col, sol))
                return true;

            /* If moving backwards in x direction doesn't give
            solution then Move upwards in y direction */
            if (solveMazeUtil(maze, row, col - 1, sol))
                return true;

            /* If none of the above movements works then
            BACKTRACK: unmark x, y as part of solution
            path */
            maze[row][col] = 1;
            return false;

        }

        return false;
    }

    private static boolean isSafe(int[][] maze, int row, int col) {
        if(row >= 0 && row < maze.length && col >= 0 && col < maze.length-1 && maze[row][col] == 1) {
            return true;
        }
        return false;
    }


}
