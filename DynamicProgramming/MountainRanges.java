import java.util.*;

public class MountainRanges {
    public static int mountainRanges(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j <= i - 1; j++) {
                int upstroke = dp[j];
                int downstroke = dp[i - j - 1];
                dp[i] += upstroke * downstroke;
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println("Enter no.of pairs:");
        Scanner sc = new Scanner(System.in);
        int pairs = sc.nextInt();
        System.out.println("No.of mountain ranges: " + mountainRanges(pairs));
    }
}
