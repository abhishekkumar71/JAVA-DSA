import java.util.*;

public class LongestIncreasingSubsequence {
    public static void Print(int dp[][]) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int lcs(int arr[], int arr2[]) {
        int dp[][] = new int[arr.length + 1][arr2.length + 1];
        for (int i = 1; i < arr.length + 1; i++) {
            for (int j = 1; j < arr2.length + 1; j++) {
                if (arr[i - 1] == arr2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    int ans1 = dp[i - 1][j];
                    int ans2 = dp[i][j - 1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }
        Print(dp);
        return dp[arr.length][arr2.length];
    }

    public static int lis(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int arr2[] = new int[arr.length];
        int i = 0;
        for (int num : set) {
            arr2[i] = num;
            i++;
        }
        Arrays.sort(arr2);
        return lcs(arr, arr2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The length of longest increasing subsequence is: " + lis(arr));
    }
}
