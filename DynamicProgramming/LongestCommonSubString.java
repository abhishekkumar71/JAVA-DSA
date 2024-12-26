import java.util.*;;

public class LongestCommonSubString {
    public static int LongestcommonSubstring(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n + 1][m + 1];
        int count = 0;

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    count = Math.max(dp[i][j], count);

                } else {
                    dp[i][j] = 0;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string1:");
        String str1 = sc.nextLine();
        System.out.println("Enter string 2:");
        String str2 = sc.nextLine();
        System.out.println("The no.of characters in the longest common substring from the given two strings:  "
                + LongestcommonSubstring(str1, str2));

    }
}
