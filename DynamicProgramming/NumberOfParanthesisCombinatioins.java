import java.util.*;

public class NumberOfParanthesisCombinatioins {
    public static int findCount(char str[], int n, int open, int closed, int pos) {
        int count = 0;
        if (closed == n) {

            for (int i = 0; i < str.length; i++) {
                System.out.print(str[i] + " ");
            }
            System.out.println();
            return 1;
        }
        if (open < n) {
            str[pos] = '(';
            count += findCount(str, n, open + 1, closed, pos + 1);
        }
        if (closed < open) {
            str[pos] = ')';
            count += findCount(str, n, open, closed + 1, pos + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  n:");
        int n = sc.nextInt();
        char str[] = new char[2 * n];
        System.out.println(findCount(str, n, 0, 0, 0));
    }
}
