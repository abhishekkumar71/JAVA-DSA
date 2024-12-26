public class prime {
    public static boolean isprime(int n) {
        boolean isprime = true;
        if (n == 2 || n == 1) {
            System.out.println("prime number");
        }
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                isprime = false;
                System.out.println("not a prime number");
                break;
            } else {
                System.out.println("prime number");
                break;
            }
        }
        return isprime;
    }

    public static void main(String[] args) {
        isprime(2019);
    }
}
