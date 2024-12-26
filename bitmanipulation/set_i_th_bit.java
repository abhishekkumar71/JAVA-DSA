import java.util.*;

public class set_i_th_bit {
    public static int set(int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println("Enter i:");
        int i = sc.nextInt();
        System.out.println(set(n, i));
    }
}
