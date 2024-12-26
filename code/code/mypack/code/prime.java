package code;

import java.util.*;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        boolean prime = true;
        if (n == 2) {
            System.out.println("Prime number");
        } else {

            for (int i = 2; i <= n - 1; i++) { // i<=math.sqrt(n)
                if (n % i == 0) {
                    prime = false;
                }
            }
            if (prime == true) {
                System.out.println("Prime number");
            } else {
                System.out.println("Not a prime number");
            }
        }
    }
}