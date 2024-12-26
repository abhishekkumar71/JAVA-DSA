import java.util.*;

public class clear_i_th_bit {
    public static int clear(int n, int i) {
        int bitmask = ~(1 << i);
        return bitmask & n;
    }

    public static void main(String[] args) {
        System.out.println("Enter n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter i:");
        int i = sc.nextInt();
        System.out.println(clear(n, i));
    }

}
