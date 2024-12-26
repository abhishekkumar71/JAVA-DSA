import java.util.*;

public class QTribonacci {
    public static void Tribonacci(int n) {
        int dp[] = new int[n];
        dp[0] = 0;
        dp[1] = 0;
        dp[2] = 1;
        System.out.print(dp[0] + " " + dp[1] + " " + dp[2] + " ");
        for (int i = 3; i < n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
            System.out.print(dp[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        Tribonacci(n);
    }
}
