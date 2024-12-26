import java.util.*;

public class LongestCommonSubsequenceMemoization {
    public static void Print(int dp[][]) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int lcs2(String str1, String strt2, int n, int m, int dp[][]) {

        if (n == 0 || m == 0) {
            return 0;
        }
        if (dp[n][m] != -1) {
            return dp[n][m];
        }
        if (str1.charAt(n - 1) == strt2.charAt(m - 1)) {
            return dp[n][m] = lcs2(str1, strt2, n - 1, m - 1, dp)+1;
        } else {
            int ans1 = lcs2(str1, strt2, n - 1, m, dp);
            int ans2 = lcs2(str1, strt2, n, m - 1, dp);
            return dp[n][m] = Math.max(ans1, ans2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string1:");
        String str1 = sc.nextLine();
        System.out.println("Enter string2: ");
        String str2 = sc.nextLine();
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n + 1][m + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println("The longest common subsequence:"+lcs2(str1, str2, n, m, dp));
        Print(dp);
    }
}
