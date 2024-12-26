public class fibonacci {
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fibnm1 = fib(n - 1);
        int fibnm2 = fib(n - 2);
        int fib = fibnm1 + fibnm2;
        return fib;
    }

    public static void main(String[] args) {
        int n =4;
        System.out.println(fib(n));
    }
}
