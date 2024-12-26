import java.util.*;

public class evenorodd {
    public static void oddoreven(int n) {
        int bit = 1;
        if ((n & bit) == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        oddoreven(n);

    }
}
