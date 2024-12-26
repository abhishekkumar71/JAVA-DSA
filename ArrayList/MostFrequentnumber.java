import java.util.*;

/**
 * MostFrequentnumber
 */
public class MostFrequentnumber {

    public static int MostFrequent(ArrayList<Integer> nums, int key) {
        int[] result = new int[100];
        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) == key) {
                result[nums.get(i + 1) - 1]++;
            }
        }
        int max = Integer.MIN_VALUE;
        int ans = 0;
        for (int i = 0; i < 100; i++) {
            if (result[i] > max) {
                max = result[i];
                ans = i + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println("Enter Elements:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            nums.add(num);
        }
        System.out.println("Enter key:");
        int key = sc.nextInt();
        System.out.println(MostFrequent(nums, key));
    }
}