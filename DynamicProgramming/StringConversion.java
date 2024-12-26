import java.util.*;

public class StringConversion {
    public static int lcs(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n + 1][m + 1];
      
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

    public static void Operations(String str1, String str2) {
        int lcs = lcs(str1, str2);
        int delete = str1.length() - lcs;
        int insert = str2.length() - lcs;
        System.out.println("Nuumber of Delete operations required: " + delete);
        System.out.println("Number of insert operations required:" + insert);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string 1:");
        String str1 = sc.nextLine();
        System.out.println("Enter string 2:");
        String str2 = sc.nextLine();
        Operations(str1, str2);

    }
}
