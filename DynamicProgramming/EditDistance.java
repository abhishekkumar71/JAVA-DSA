import java.util.*;

public class EditDistance {
    public static void Print(int dp[][]) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int MinOPerations(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n + 1][m + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                if (i == 0) {
                    dp[0][j] = j;
                } else if (j == 0) {
                    dp[i][0] = i;
                }
            }
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                // CHARACTERS ARE SAME
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    // NO ACTION
                    dp[i][j] = dp[i - 1][j - 1];
                }
                // CHARACTERS ARE DIFFERENT
                else {
                    int add = dp[i][j - 1] + 1; // here'1' REFERS TO OPERATION COUN
                    int del = dp[i - 1][j] + 1;
                    int replace = dp[i - 1][j - 1] + 1;
                    dp[i][j] = Math.min(Math.max(add, del), replace);
                }
            }
        }
        Print(dp);
        return dp[n][m];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string1:");
        String str1 = sc.nextLine();
        System.out.println("Enter string 2:");
        String str2 = sc.nextLine();
        System.out.println("The minimum number of operations required to convert string 1 to string 2:"
                + MinOPerations(str1, str2));
    }
}
