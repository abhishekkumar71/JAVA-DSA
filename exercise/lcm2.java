import java.util.*;

public class lcm2 {
    static void lcm(int n1, int n2) {
        int gcd = 1;
        int lcm;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        lcm = (n1 * n2) / gcd;
        System.out.println("LCM of two numbers is:" + lcm);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n1:");
        int n1 = sc.nextInt();
        System.out.println("Enter n2:");
        int n2 = sc.nextInt();
        lcm(n1, n2);
    }
}
