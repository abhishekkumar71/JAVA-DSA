import java.util.*;

public class adding1 {
    public static void add(int n) {
        // 2'S COMPLIMENT
        n = ~(~n) + 1;
        System.out.println(n);

    }

    public static void main(String[] args) {
        System.out.println("Enter n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        add(n);
    }
}
