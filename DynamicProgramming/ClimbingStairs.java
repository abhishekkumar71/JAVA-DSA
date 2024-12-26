import java.util.Arrays;

/**
 * ClimbingStairs
 */
public class ClimbingStairs {

    public static int ways(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        return ways(n - 1) + ways(n - 2);
    }

    public static int waysMemoization(int ways[], int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if (ways[n] != -1) {
            return ways[n];
        }
        ways[n] = waysMemoization(ways, n - 1) + waysMemoization(ways, n - 2);
        return ways[n];
    }

    public static int WaysTabulation(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                dp[1] = dp[i - 1];
            } else {
                dp[i] = dp[i - 2] + dp[i - 1];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Total number of ways to climb 'n' stairs: " + ways(n));
        int ways[] = new int[n + 1];
        Arrays.fill(ways, -1);
        System.out.println("No.of ways to climb 'n' stairs: " + waysMemoization(ways, n));
        System.out.println("total no.of ways: " + WaysTabulation(n));
    }
}