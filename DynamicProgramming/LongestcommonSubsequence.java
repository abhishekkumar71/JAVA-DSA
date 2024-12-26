import java.util.*;

public class LongestcommonSubsequence {
    public static int lcs(String str1, String str2, int n, int m) {
        if (n == 0 || m == 0) {
            return 0;
        }
        if (str1.charAt(n - 1) == str2.charAt(m - 1)) {
            return lcs(str1, str2, n - 1, m - 1) + 1;
        } else {
            int ans1 = lcs(str1, str2, n - 1, m);
            int ans2 = lcs(str1, str2, n, m - 1);
            return Math.max(ans1, ans2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string 1:");
        String str1 = sc.nextLine();
        System.out.println("Enter String 2:");
        String str2 = sc.nextLine();
        int n = str1.length();
        int m = str2.length();
        System.out.println("The longest common subsequence: " + lcs(str1, str2, n, m));
    }
}
