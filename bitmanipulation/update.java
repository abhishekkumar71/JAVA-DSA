import java.util.*;

public class update {
    public static int set(int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;
    }

    public static int clear(int n, int i) {
        int bitmask = ~(1 << i);
        return bitmask & n;
    }

    public static int update(int n, int i, int newbit) {
        if (newbit == 0) {
            return clear(n, i);
        } else {
            return set(n, i);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("enter ith position");
        int i = sc.nextInt();
        System.out.println("Enter newbit");
        int newbit = sc.nextInt();
        System.out.println(update(n, i, newbit));
    }
}
