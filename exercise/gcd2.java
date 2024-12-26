import java.util.*;

public class gcd2 {
    static int gcd(int n1, int n2) {
        while (n1 != n2) {
            if (n1 > n2) {
                n1 -= n2;
            } else {
                n2 -= n1;
            }
        }
        return n1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n1:");
        int n1 = sc.nextInt();
        System.out.println("Enter n2:");
        int n2 = sc.nextInt();
        System.out.println("GCD of two numbers is:" + gcd(n1, n2));
    }
}
