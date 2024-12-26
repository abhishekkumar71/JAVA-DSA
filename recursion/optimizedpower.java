public class optimizedpower {
    public static int optimized(int a, int n) {
        if (n == 0) {
            return 1;
        }
        int halfpower = optimized(a, n / 2) * optimized(a, n / 2);
        if (n % 2 != 0) {
            halfpower = a * halfpower;
        }
        return halfpower;
    }

    public static void main(String[] args) {
        System.out.println(optimized(4, 3));
    }
}
