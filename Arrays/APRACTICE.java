import java.util.*;

public class APRACTICE {
    public static void largest_Number(int arr[]) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The largest element is:" + max);

    }

    public static void Smallest_number(int arr[]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Smallest number is:" + min);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter elements:");
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        largest_Number(arr);
        Smallest_number(arr);

    }
}
