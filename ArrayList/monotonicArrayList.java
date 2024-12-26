import java.util.*;

public class monotonicArrayList {
    public static boolean montonic(ArrayList<Integer> nums) {
        boolean inc = true;
        boolean dec = true;
        for (int i = 0; i < nums.size() - 1; i++) {
            int j = i + 1;
            if (nums.get(i) < nums.get(j)) {
                inc = false;
            } else if (nums.get(i) > nums.get(j)) {
                dec = false;
            }
        }
        return inc || dec;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        System.out.println(montonic(nums));

    }
}
