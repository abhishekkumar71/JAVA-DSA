public class PartitionEqualSubsetSum {

    public static boolean Subsetsum(int nums[]) {
        int n = nums.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }
        if(sum%2!=0){
            return false;
        }
        int w = sum / 2;
        boolean dp[][] = new boolean[n + 1][w + 1];
        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = true;
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < w + 1; j++) {
                if (nums[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j - nums[i - 1]] || dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][w];
    }

    public static void main(String[] args) {
        int nums[] = { 1, 5, 11, 5 };
        System.out.println("The array can be partitioned:"+Subsetsum(nums));
    }
}
