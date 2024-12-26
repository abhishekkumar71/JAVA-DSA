public class CatalansNumber {
    public static int Catalan(int n) {
        if (n == 0 | n == 1) {
            return 1;
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += Catalan(i) * Catalan(n - i - 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("Catalan's Number:" + Catalan(n));
    }
}
