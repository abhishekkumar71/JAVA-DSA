import java.util.*;

public class HOUSEROBBER {
    public static int findMaxMoney(int nums[], int i) {
        int n=nums.length;
      if (i>=n) {
        return 0;
      }
      int rob=findMaxMoney(nums, i+2)+nums[i];
      int donotrob=findMaxMoney(nums, i+1);
      return Math.max(rob, donotrob);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of houses:");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter money of each house:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("The maximum amount of money that can be robbed:" + findMaxMoney(nums, 0));
    }
}
