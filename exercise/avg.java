import java.util.*;
// AVERAGE OF 3 NUMBERS
class avg {
    static float avg(int a, int b, int c) {
        float avg;
        avg = (a + b + c) / 3f;
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b:");

        int b = sc.nextInt();
        System.out.println("Enter c:");

        int c = sc.nextInt();
        System.out.println("Average of the numbers:"+avg(a, b, c));
    }
}