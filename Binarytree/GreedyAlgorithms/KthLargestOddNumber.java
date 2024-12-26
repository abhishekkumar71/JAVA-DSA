import java.util.*;

public class KthLargestOddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter L:");
        int L = sc.nextInt();
        System.out.println("Enter R:");
        int R = sc.nextInt();
        System.out.println("Enter K:");
        int K = sc.nextInt();
        int size = (R - L) + 1;
        int arr[] = new int[size];
        int count = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = L;
            L++;
            if (arr[i] % 2 != 0) {
                ans.add(arr[i]);
                count++;
            }
            if (K > count) {
                return;
            }
        }

        Collections.sort(ans, Collections.reverseOrder());
        System.out.println("largest odd number:" + ans.get(K - 1));
    }
}
