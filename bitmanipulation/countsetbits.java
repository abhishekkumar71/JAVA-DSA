import java.util.*;

public class countsetbits {
    public static void count(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 0) {
                count++;
            }
            n = n >> 1;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        System.out.println("Enter n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        count(n);
    }
}
