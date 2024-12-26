public class sumofint {
    public static void sum(int n) {
        int sum = 0;
        int lastDigit = 0;
        while (n > 0) {
            lastDigit = n % 10;
            sum = sum + lastDigit;
            n = n / 10;
        }
        System.out.println("sum of digits = "+sum);
    }

    public static void main(String[] args) {
        sum(934);
    }
}
