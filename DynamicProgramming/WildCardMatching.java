import java.util.*;

public class WildCardMatching {
    public static void Print(boolean dp[][]) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean isMatching(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();
        boolean dp[][] = new boolean[n + 1][m + 1];
        dp[0][0]=true;
        for (int i = 1; i < n + 1; i++) {
            dp[i][0] = false;
        }
        for (int j = 1; j < m + 1; j++) {
            if (pattern.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 1];
            }
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (text.charAt(i - 1) == pattern.charAt(j - 1) || pattern.charAt(j - 1) == '?') {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (pattern.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i - 1][j] || dp[i][j - 1];
                } else {
                    dp[i][j] = false;
                }
            }
        }
        Print(dp);
        return dp[n][m];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Text:");
        String text = sc.nextLine();
        System.out.println("Enter Pattern:");
        String pattern = sc.nextLine();
        System.out.println("Pattern matches:" + isMatching(text, pattern));
    }
}
