package GeeksForGeeks.Graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class NumberOfIslands {

    static class Pair {
        public int first;
        public int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public static int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        int visited[][] = new int[rows][cols];
        int noOfIslands = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (visited[i][j] != 1 && grid[i][j] == '1') {
                    bfs(grid, visited, i, j);
                    noOfIslands++;
                }
            }
        }
        return noOfIslands;
    }

    public static void bfs(char[][] grid, int[][] visited, int row, int col) {
        int rows = grid.length;
        int cols = grid[0].length;

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(row, col));
        visited[row][col] = 1;

        while (!q.isEmpty()) {
            Pair temp = q.poll();
            int first = temp.first;
            int second = temp.second;
            for (int i = - 1; i <= 1; i++) {
                for (int j = - 1; j <= 1; j ++) {
                    int r = first + i;
                    int c = second + j;
                    if (r < 0 || c < 0 || r >= rows || c >= cols ) continue;

                    if (visited[r][c] != 1 && grid[r][c] == '1') {
                        q.add(new Pair(r, c));
                        visited[r][c] = 1;
                    }
                }
            }
        }
    }

    public static void bfs1(char[][] grid, int[][] visited, int row, int col) {
        int rows = grid.length;
        int cols = grid[0].length;

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(row, col));
        visited[row][col] = 1;

        int[] delrow = {-1, 0, 1, 0};
        int[] delcol = {0, 1, 0, -1};

        while (!q.isEmpty()) {
            Pair temp = q.poll();
            int first = temp.first;
            int second = temp.second;
            for (int i = 0; i < 4; i++) {
                int r = first + delrow[i];
                int c = second + delcol[i];

                if (r < 0 || c < 0 || r >= rows || c >= cols) continue;

                if (visited[r][c] != 1 && grid[r][c] == '1') {
                    System.out.println("r = " + r + " C = " + c );
                    q.add(new Pair(r, c));
                    visited[r][c] = 1;
                }

            }
        }
    }

    public static void main(String[] args) {
        System.out.println(numIslands(new char[][]{
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        }));

//        System.out.println(numIslands(new char[][]{
//                {'1', '1', '1'},
//                {'0', '1', '0'},
//                {'1', '1', '1'}
//        }));
        Stack<Character> st = new Stack();
        st.add('a');
        Stack<Character> stack = new Stack();
        stack.addAll(st);
    }
}
