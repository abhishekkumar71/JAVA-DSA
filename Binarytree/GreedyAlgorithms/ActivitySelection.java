
/**
 * ActivitySelection
 */
//**********SORTED*****************
import java.util.*;

public class ActivitySelection {
    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };

        // END TIME BASIS SORTED
        int maxact = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        // 1st ACTIVITY
        maxact = 1;
        ans.add(0);
        int lastEnd = end[0];
        for (int i = 0; i < end.length; i++) {
            if (start[i] >= lastEnd) {
                // ACTIVITY END
                maxact++;
                ans.add(i);
                lastEnd = end[i];

            }
        }
        System.out.println(maxact);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();
    }

}