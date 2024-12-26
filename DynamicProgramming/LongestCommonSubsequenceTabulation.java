import java.util.*;

public class LongestCommonSubsequenceTabulation {
    public static int lcsTabulization(String str1, String str2, int n, int m) {
        int dp[][] = new int[n + 1][m + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    int ans1 = dp[i - 1][j];
                    int ans2 = dp[i][j - 1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }
        return dp[n][m];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string 1:");
        String str1 = sc.nextLine();
        System.out.println("Enter string 2:");
        String str2 = sc.nextLine();
        int n = str1.length();
        int m = str2.length();
        System.out.println("The longest common subsequence: " + lcsTabulization(str1, str2, n, m));

    }
}
