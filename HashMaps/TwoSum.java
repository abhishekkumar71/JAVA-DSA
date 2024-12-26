import java.util.*;

public class TwoSum {
    public static int[] getIndex(int arr[], int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int diff = target - arr[i];
            if (map.containsKey(diff)) {
                return new int[] { i, map.get(diff) };
            }
            map.put(arr[i], i);
        }
        return new int[] { 0, 0 };

    }

    public static void main(String[] args) {
        int arr[] = { 2, 7, 11, 15 };
        int target = 9;
        /*
         * for(int i=0;i<arr.length;i++){
         * for(int j=i+1;j<arr.length;j++){
         * if (arr[i]+arr[j]==target) {
         * System.out.print(i+" "+j);
         * }
         * }
         * }
         */
        int idx[] = getIndex(arr, target);
        for (int i = 0; i < idx.length; i++) {
            System.out.print(idx[i] + " ");
        }
    }
}
