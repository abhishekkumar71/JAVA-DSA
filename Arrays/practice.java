//FINDING ELEMENT
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        System.out.println("enter size:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("Enter array elements:");
        int array[] = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("enter number:");
        int n = sc.nextInt();
        for (int i = 0; i < size; i++) {
            if (array[i] == n) {
                System.out.println("Element found at:" + i);
            }
        }
    }
}