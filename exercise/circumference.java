import java.util.*;

// CIRCUMFERENCE OF A CIRCLE
public class circumference {
    static float circumference(int r) {
        float circumference = 2 * 3.14f * r;
        return circumference;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius:");
        int r = sc.nextInt();
        System.out.println("Circumference of the circle is:" + circumference(r));
    }
}
