package code.mypack.practice;

import java.util.*;

public class reversing {
    public static void main(String[] args) {
        System.out.println("enter n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            rev = (rev * 10) + lastdigit;
            n = n / 10;
        }
        System.out.println(rev);
    }
}
