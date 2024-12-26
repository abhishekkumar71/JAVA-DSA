import java.util.*;

public class product {
    public static int product(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        System.out.println("Enter a and b:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Product of two numbers is:" + product(a, b));
    }
}
