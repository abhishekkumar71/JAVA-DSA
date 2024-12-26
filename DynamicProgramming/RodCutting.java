public class RodCutting {
    public static void Print(int dp[][]) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int rodCutting(int length[], int price[], int RodLen) {
        int n = price.length;
        int dp[][] = new int[n + 1][RodLen + 1];
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < RodLen + 1; j++) {
                if (length[i - 1] <= j) {
                    dp[i][j] = Math.max(price[i - 1] + dp[i][j - length[i - 1]], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        Print(dp);
        return dp[n][RodLen];

    }

    public static void main(String[] args) {
        int length[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int price[] = { 1, 5, 8, 9, 10, 17, 17, 20 };
        int RodLen = 8;
        System.out.println("The Maximum profit: " + rodCutting(length, price, RodLen));
    }
}
