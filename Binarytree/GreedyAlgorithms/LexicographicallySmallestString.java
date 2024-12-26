import java.util.*;

public class LexicographicallySmallestString {
    private static char c;

    public static String smalleststring(int n, int k) {
        StringBuilder sb = new StringBuilder();
        int total_chars = n;
        int csum = k;
        while (total_chars > 0) {
            if ((total_chars - 1) * 26 >= (csum - 1)) {
                sb.append('a');
                csum--;
            } else {
                int position = csum % 26;
                if (position == 0) {
                    sb.append('z');
                    csum -= 26;
                } else {
                    sb.append((char) (position - 1 + 'a'));
                    csum -= position;
                }
            }
            total_chars--;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println("enter k:");
        int k = sc.nextInt();
        System.out.println(smalleststring(n, k));

    }
}
