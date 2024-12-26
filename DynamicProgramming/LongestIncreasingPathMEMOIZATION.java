public class LongestIncreasingPathMEMOIZATION {
    public static int findPath(int m[][], int N, int M, int i, int j, int dp[][]) {
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int rowTraversal = 0;
        if (i + 1 < N && m[i + 1][j] > m[i][j]) {
            rowTraversal = findPath(m, N, M, i + 1, j, dp);
        }
        int colTraversal = 0;
        if (j + 1 < M && m[i][j + 1] > m[i][j]) {
            colTraversal = findPath(m, N, M, i, j + 1, dp);
        }
        dp[i][j] = Math.max(rowTraversal, colTraversal) + 1;
        System.out.print(dp[i][j] + " ");
        return dp[i][j];
    }

    public static void main(String[] args) {
        int m[][] = { { 1, 2, 3, 4 }, { 2, 2, 3, 4 }, { 3, 2, 3, 4 }, { 4, 5, 6, 7 } };
        int N = m.length;
        int M = m[0].length;
        int dp[][] = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println("The length of longest increasing path:" + findPath(m, N, M, 0, 0, dp));
    }
}
