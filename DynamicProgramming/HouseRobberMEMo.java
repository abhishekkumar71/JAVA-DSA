import java.util.*;

public class HouseRobberMEMo {
    public static int rob(int nums[]) {
        int n = nums.length;
        int dp[] = new int[n];
        Arrays.fill(dp, -1);
        int i = 0;
        return findMax(nums, n, dp, i);
    }

    public static int findMax(int nums[], int n, int dp[], int i) {
        if (i >= n) {
            return 0;
        }
        if (dp[i] != -1) {
            return dp[i];
        }
        int rob = findMax(nums, n, dp, i + 2) + nums[i];
        int donotrob = findMax(nums, n, dp, i + 1);
        dp[i] = Math.max(rob, donotrob);
        return dp[i];
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
