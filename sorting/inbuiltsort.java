import java.util.*;

public class inbuiltsort {
    public static void print(Integer n[]) {
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
    }

    public static void main(String[] args) {
        Integer n[] = { 333, 17, 18, 7, 3, 45 };
        // Arrays.sort(n);
        // Arrays.sort(n,2,4);
        // Arrays.sort(n,Collections.reverseOrder());
        Arrays.sort(n, 2, 4, Collections.reverseOrder());
        print(n);
    }
}
