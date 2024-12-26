import java.util.*;

public class FloodFillsAlgorithm {
    public static void helper(int image[][], boolean vis[][], int sr, int sc, int color, int orgCol) {

        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || vis[sr][sc] || image[sr][sc] != orgCol) {
            return;
        }
        vis[sr][sc] = true;
        image[sr][sc] = color;
        // UP
        helper(image, vis, sr - 1, sc, color, orgCol);
        // DOWN
        helper(image, vis, sr + 1, sc, color, orgCol);
        // LEFT
        helper(image, vis, sr, sc - 1, color, orgCol);
        // RIGHT
        helper(image, vis, sr, sc + 1, color, orgCol);
    }

    public static int[][] Floodfill(int image[][], int sr, int sc, int color, int orgCol) {

        boolean vis[][] = new boolean[image.length][image[0].length];
        helper(image, vis, sr, sc, color, orgCol);
        return image;

    }

    public static void Print(int image[][]) {
        for (int[] row : image) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        int image[][] = { { 1, 1, 1 }, { 1, 1, 0 }, { 1, 0, 1 } };
        int sr = 1, sc = 1, color = 2;
        int orgCol = image[sr][sc];
        int[][] result = Floodfill(image, sr, sc, color, orgCol);
        Print(result);
    }
}
