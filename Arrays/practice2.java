import java.util.*;
//SUM OF 5 FLOATS
public class practice2 {
    public static void main(String[] args) {
        System.out.println("Enter elements:");
        Scanner sc = new Scanner(System.in);
        float[] n = new float[5];
        float sum = 0;
        for (int i = 0; i < 5; i++) {
            n[i] = sc.nextFloat();
        }
        for (int i = 0; i < 5; i++) {
            sum += n[i];
        }
        System.out.println("sum of the elements:" + sum);
    }
}
