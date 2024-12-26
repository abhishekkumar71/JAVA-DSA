import java.util.*;

public class MountainArray {
    public static int minimumMountainRemovals(int nums[]) {
        int n = nums.length;
        int lis[] = new int[n];
        for (int i = 0; i < n; i++) {
            int val = nums[i];
            lis[i] = 1;
            for (int j = i - 1; j >= 0; j--) {
                if (nums[j] < val) {
                    lis[i] = Math.max(lis[i], lis[j] + 1);
                }
            }
        }
        int lds[] = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            int val = nums[i];
            lds[i] = 1;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < val) {
                    lds[i] = Math.max(lds[i], lds[j] + 1);
                }
            }
        }
        int mountainLen = 0;
        for (int i = 0; i < n; i++) {
            if (lds[i] == 1 || lis[i] == 1) {
                continue;
            }
            mountainLen = Math.max(mountainLen, lis[i] + lds[i] - 1);
        }
        return (n - mountainLen);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println("Enter array");
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("The minimium removals are:" + minimumMountainRemovals(nums));
    }
}
