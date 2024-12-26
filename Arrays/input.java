import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        System.out.println("Enter size:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int marks[] = new int[size];
        System.out.println("enter marks:");
        for (int i = 0; i < size; i++) {
            marks[i] = sc.nextInt();
        }
        System.out.println("marks:");
        for (int i = 0; i < size; i++) {
            System.out.println(marks[i]);
        }
    }
}