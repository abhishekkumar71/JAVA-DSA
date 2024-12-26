import java.util.*;

public class multid2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter columns:");
        int columns = sc.nextInt();
        int n[][] = new int[rows][columns];
        System.out.println("Enter elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                n[i][j] = sc.nextInt();
            }

        }
        System.out.println("elemments are:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println(n[i][j]);
            }
        }
    }
}
