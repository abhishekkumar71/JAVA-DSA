import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            /*
             * if (hm.containsKey(num)) {
             * hm.put(num, hm.get(num) + 1);
             * } else {
             * hm.put(num, 1);
             */
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        for (Integer key : hm.keySet()) {
            if (hm.get(key) > arr.length / 3) {
                System.out.println("majority element in the array: " + key);
            }
        }
    }
}
