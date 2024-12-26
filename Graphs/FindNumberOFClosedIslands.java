import java.util.*;

public class FindNumberOFClosedIslands {
    public static void dfs(int mat[][], boolean vis[][], int i, int j, int rows, int cols, boolean hasCorner) {
        if (i < 0 || j < 0 || i >= rows || j >= cols || mat[i][j] == 1 || vis[i][j]) {
            return;
        }
        vis[i][j] = true;

        if (i == 0 || j == 0 || i == rows - 1 || j == cols - 1) {
            if (mat[i][j] == 1) {
                hasCorner = true;
            }
        }
        // up
        dfs(mat, vis, i - 1, j, rows, cols, hasCorner);
        // DOWN
        dfs(mat, vis, i + 1, j, rows, cols, hasCorner);
        // LEFT
        dfs(mat, vis, i, j - 1, rows, cols, hasCorner);
        // RIGHT
        dfs(mat, vis, i, j + 1, rows, cols, hasCorner);

    }

    public static int CountClosed(int mat[][], int rows, int cols) {
        boolean vis[][] = new boolean[rows][cols];
        int result = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 0 && !vis[i][j]) {
                    boolean hasCorner = false ;
                    dfs(mat, vis, i, j, rows, cols, hasCorner);
                    if (!hasCorner) {
                        result++;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int N = 5;
        int M = 8;
        int mat[][] = { { 0, 0, 0, 0, 0, 0, 0, 1 },
                        { 0, 1, 1, 1, 1, 0, 0, 1 },
                        { 0, 1, 0, 1, 0, 0, 0, 1 },
                        { 0, 1, 1, 1, 1, 0, 1, 0 },
                        { 0, 0, 0, 0, 0, 0, 0, 1 } };
        System.out.println(CountClosed(mat, N, M));
    }
}
