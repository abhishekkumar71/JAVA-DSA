import java.util.*;

public class BeautifulArraylist {
    public static ArrayList<Integer> FindingBeautifulArrayList(int n) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        while (nums.size() < n) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int i = 0; i < nums.size(); i++) {

                if ((nums.get(i) * 2 - 1) <= n) {
                    temp.add(nums.get(i) * 2 - 1);
                }

            }
            for (int i = 0; i < nums.size(); i++) {
                if (nums.get(i) * 2 <= n) {
                    temp.add(nums.get(i) * 2);
                }

            }
            nums = temp;

        }
        return nums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        ArrayList<Integer> nums = FindingBeautifulArrayList(n);
        for (int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i) + " ");
        }

    }
}
