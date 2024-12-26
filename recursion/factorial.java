public class factorial {
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm1 = fact(n - 1);
        int fact = n * fnm1;
        return fact;

    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));
    }
}
