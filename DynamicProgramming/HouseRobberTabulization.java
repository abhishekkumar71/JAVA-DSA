import java.util.*;

public class HouseRobberTabulization {
    public static int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n + 1];
        dp[0] = nums[0];
        dp[1] = n > 1 ? Math.max(nums[0], nums[1]) : nums[1];
        for (int i = 2; i < n; i++) {
            int rob = dp[i - 2] + nums[i];
            int donotrob = dp[i - 1];
            dp[i] = Math.max(rob, donotrob);
        }

        return dp[n - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of houses:");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter money of each house:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("The max amount of money:" + rob(nums));
    }
}
