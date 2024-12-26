import java.util.*;

public class MaximumBalancedStringPartitions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String str = sc.nextLine();
        int l = 0, r = 0;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'L') {
                l++;
            } else if (str.charAt(i) == 'R') {
                r++;
            }
            if (l == r) {
                System.out.println(str.substring(i + 1));
                count++;
            }
        }
        System.out.println(count);

    }
}
