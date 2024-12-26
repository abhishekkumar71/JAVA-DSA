import java.util.*;

public class LongestPalindromicsequenceTabulation {
    public static int findLongest(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder(s);
        String rev = sb.reverse().toString();
        int dp[][] = new int[n + 1][n + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (s.charAt(i - 1) == rev.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    int ans1 = dp[i - 1][j];
                    int ans2 = dp[i][j - 1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }
        return dp[n][n];

    }

    public static void main(String args[]) {
        System.out.println("Enter string:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(findLongest(str));
    }
}
