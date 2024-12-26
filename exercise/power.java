import java.util.*;
/// X TO THE POWER OF N
public class power {
    static double power(double x, double n) {
        double power = Math.pow(x, n);
        return power;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x:");
        double x = sc.nextDouble();
        System.out.println("Enter n:");
        double n = sc.nextDouble();
        System.out.println(" x to the power of  n:"+power(x, n));
    }
}
