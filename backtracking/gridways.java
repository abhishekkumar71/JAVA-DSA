import java.util.*;

public class gridways {
    public static int noOfgridways(int i, int j, int n, int m) {
        if (i == n - 1 && j == m - 1) {
            return 1;
        } else if (i == n || j == m) {
            return 0;
        }
        int w1 = noOfgridways(i+1, j, n, m);
        int w2 = noOfgridways(i, j + 1, n, m);
        return w1 + w2;

    }

    public static void main(String[] args) {
        System.out.println("Enter n and m:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("total no.of ways:"+noOfgridways(0, 0, n, m));
    }
}
