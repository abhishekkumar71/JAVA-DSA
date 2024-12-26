/**
 * WaysOfDP
 */
// Two ways
/*
 * MEMOIZATION
 * TABULIZATION
 */
public class WaysOfDP {

    //*************FIBONACCI******************* */
    public static int Memoization(int fib[], int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (fib[n] != 0) {
            return fib[n];
        }
        fib[n] = Memoization(fib, n - 1) + Memoization(fib, n - 2);
        return fib[n];
    }

    public static int Tabulation(int n, int fib[]) {
        int dp[] = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 6;
        int fib[] = new int[n + 1];
        System.out.println(Memoization(fib, n));
        System.out.println(Tabulation(n, fib));
    }
}