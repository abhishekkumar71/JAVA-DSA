import java.util.*;

public class powerof2 {
    public static void power(int n) {
        if ((n & n - 1) == 0) {
            System.out.println("the number is a power of 2");
        } else {
            System.out.println("the number is not  a power of 2");

        }
    }

    public static void main(String[] args) {
        System.out.println("Enter n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        power(n);

    }
}
