
//x^n
import java.util.*;

public class powerofn {
    public static int power(int x, int n) {
        int xnm1 = (int) Math.pow(x, n - 1);
        int xn = x * xnm1;
        return xn;
    }

    public static void main(String[] args) {
        System.out.println(power(5, 3));
    }
}
