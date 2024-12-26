import java.util.*;

public class LonelyNumbers {
    public static ArrayList FindLonelyNumbers(ArrayList<Integer> nums) {
        Collections.sort(nums);
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            if (i != 0 && (nums.get(i - 1) == nums.get(i) - 1 || nums.get(i - 1) == nums.get(i))) {
                continue;
            }
            if (i != nums.size() - 1 && (nums.get(i + 1) == nums.get(i) + 1 || nums.get(i + 1) == nums.get(i))) {
                continue;
            }
            result.add(nums.get(i));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            nums.add(num);
        }
        ArrayList<Integer> arr = FindLonelyNumbers(nums);
        System.out.print(arr);
    }
}
