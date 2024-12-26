import java.util.*;

public class MinimumJumps {
    public static int minJumps(int arr[], int n) {
        int dp[] = new int[n];
        Arrays.fill(dp, -1);
        dp[n - 1] = 0;
        for (int i = n - 2; i >= 0; i--) {
            int steps = arr[i];
            int ans = Integer.MAX_VALUE;

            for (int j = i+1; j < n && j <= i + steps; j++) {
                if (dp[j] != -1) {
                    ans = Math.min(ans, dp[j] + 1);
                }
                if (ans != Integer.MAX_VALUE) {
                    dp[i] = ans;
                }

            }
        }
        return dp[0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Minimum no.of jumps required to move from 1st to last index:" + minJumps(arr, n));
    }
}
