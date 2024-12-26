public class KnapsackMemoization {
    public static int knapsackMemoization(int val[], int wt[], int W, int idx, int dp[][]) {
        if (W == 0 || idx == val.length) {
            return 0;
        }
        if (dp[val.length][W] != -1) {
            return dp[val.length][W];
        }
        if (wt[idx] <= W) {
            // INCLUDE
            int ans1 = val[idx] + knapsackMemoization(val, wt, W - wt[idx], idx + 1, dp);
            // EXCLUDE
            int ans2 = knapsackMemoization(val, wt, W, idx + 1, dp);
            dp[idx][W] = Math.max(ans1, ans2);
            return dp[idx][W];
        } else {
            dp[idx][W] = knapsackMemoization(val, wt, W, idx + 1, dp);
            return dp[idx][W];
        }
    }

    public static void main(String[] args) {
        int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int W = 7;
        int dp[][] = new int[val.length + 1][W + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println("MAX Profit of KnapSack: " + knapsackMemoization(val, wt, W, 0, dp));
    }
}
