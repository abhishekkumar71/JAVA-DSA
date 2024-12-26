public class LongestIncreasingPath {
    public static int findPath(int m[][], int N, int M, int i, int j) {
        if (i == N || j == M) {
            return 0;
        }
        int rowTraversal = 0;
        if (i + 1 < N && m[i + 1][j] > m[i][j]) {
            rowTraversal = findPath(m, N, M, i + 1, j);
        }
        int colTraversal = 0;
        if (j + 1 < M && m[i][j + 1] > m[i][j]) {
            colTraversal = findPath(m, N, M, i, j + 1);
        }

        return Math.max(rowTraversal, colTraversal) + 1;

    }

    public static void main(String[] args) {
        int m[][] = { { 1, 2, 3, 4 }, { 2, 2, 3, 4 }, { 3, 2, 3, 4 }, { 4, 5, 6, 7 } };
        int N = 4, M = 4;
        System.out.println("The length of longest increasing path:" + findPath(m, N, M, 0, 0));
    }
}
