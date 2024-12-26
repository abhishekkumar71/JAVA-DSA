/**
 * MAXSizeofRegion
 */
public class MAXSizeofRegion {
    public static int dfs(int i, int j, int rows, int cols, boolean vis[][], int arr[][]) {
        if (i < 0 || j < 0 || i >= rows || j >= cols || vis[i][j] || arr[i][j] == 0) {
            return 0;
        }
        vis[i][j] = true;
        int size = 1;
        for (int dx = -1; dx <= 1; dx++) {
            for (int dy = -1; dy <= 1; dy++) {
                size += dfs(i + dx, j + dy, rows, cols, vis, arr);
            }
        }
        return size;
    }

    public static int findMax(int arr[][], int rows, int cols) {

        boolean vis[][] = new boolean[rows][cols];
        int max = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == 1 && !vis[i][j]) {
                    max = Math.max(max, dfs(i, j, rows, cols, vis, arr));
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[][] = { { 0, 0, 1, 1, 0 }, { 0, 0, 1, 1, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 1 } };
        int rows = arr.length;
        int cols = arr[0].length;
        System.out.println(findMax(arr, rows, cols));
    }

}