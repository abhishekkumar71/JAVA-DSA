import java.util.*;
// FINDING THE GREATEST NUMBER AMONG THE GIVEN 2 NUMBERS
public class greatest {
    static int greater(int a, int b) {
        if (a > b) {
            return a;
        } else  {
           return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b:");

        int b = sc.nextInt();
        System.out.println("Greatest number among the given numbers is:" + greater(a, b));
    }
}