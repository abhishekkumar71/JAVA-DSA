import java.util.*;

public class fastexponentiation {
    public static void fast(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        System.out.println("enter a:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter n:");
        int n = sc.nextInt();
        fast(a, n);

    }
}
