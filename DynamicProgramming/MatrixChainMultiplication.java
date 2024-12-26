import java.util.*;

public class MatrixChainMultiplication {
    public static int MCM(int arr[], int i, int j) {
        if (i == j) {
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            int cost1 = MCM(arr, i, k);
            int cost2 = MCM(arr, k + 1, j);
            int cost3 = arr[i - 1] * arr[k] * arr[j];
            int finalCost = cost1 + cost2 + cost3;
            ans = Math.min(ans, finalCost);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The MIN cost:" + MCM(arr, 1, n - 1));
    }
}
