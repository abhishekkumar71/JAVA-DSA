import java.util.*;

public class gcd {
    // GCD
    static int gcd(int n1, int n2) {
        int gcd = 1;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n1:");
        int n1 = sc.nextInt();
        System.out.println("Enter n2:");
        int n2 = sc.nextInt();
        System.out.println("GCD of two nuumbers is:" + gcd(n1, n2));
    }
}
