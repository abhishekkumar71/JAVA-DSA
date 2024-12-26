import java.util.*;
// SUM OF ODD NUMBERS
public class sumodd {
    static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println("sum of odd numbers is:" + sum(n));
    }
}
