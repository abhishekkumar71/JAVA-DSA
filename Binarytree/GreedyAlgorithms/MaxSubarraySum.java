
/**
 * MaxSubarraySum
 */
import java.util.*;

//THE MAX SUBARRAY SUM ACHIEVABLE OUT OF 'K' SUBARRAYS FORMED MUST BE THE MIN POSSIBLE
public class MaxSubarraySum {
    public static int ans = Integer.MAX_VALUE;

    public static void solve(int arr[], int n, int k, int index, int maxsum, int sum) {

        if (k == 1) {
            maxsum = Math.max(maxsum, sum);
            sum = 0;
            for (int i = index; i < n; i++) {
                sum += arr[i];
            }
            maxsum = Math.max(maxsum, sum);
            ans = Math.min(maxsum, ans);
            return;
        }
        sum = 0;
        for (int i = index; i < n; i++) {
            sum += arr[i];
            maxsum = Math.max(maxsum, sum);
            solve(arr, n, k - 1, i + 1, maxsum, sum);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter size of array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter k:");
        int k = sc.nextInt();
        solve(arr, n, k, 0, 0, 0);
        System.out.println(ans);
    }

}