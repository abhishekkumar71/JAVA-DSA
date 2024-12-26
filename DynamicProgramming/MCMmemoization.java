import java.util.*;

public class MCMmemoization {
    public static int MCM(int arr[], int dp[][], int i, int j, int n) {
        if (i == j) {
            return 0;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int ans = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            int cost1 = MCM(arr, dp, i, k, n);
            int cost2 = MCM(arr, dp, k + 1, j, n);
            int cost3 = arr[i - 1] * arr[k] * arr[j];
            int finalCost = cost1 + cost2 + cost3;
            ans = Math.min(ans, finalCost);
        }
        return dp[i][j] = ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println("Enter array elements:");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int dp[][] = new int[n][n];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println("The MIN cost:"+MCM(arr, dp, 1, n - 1, n));
    }
}
