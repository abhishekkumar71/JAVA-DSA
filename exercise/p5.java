import java.util.*;
//FINDING IF ELIGIBLE FOR  VOTING OR NOT BY AGE
public class p5 {
    static void eligible(int age) {
        if (age < 18) {
            System.out.println("Not eligible for voting");
        } else if (age >= 18) {
            System.out.println("Eligible for voting");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age:");
        int age = sc.nextInt();
        eligible(age);
    }
}
