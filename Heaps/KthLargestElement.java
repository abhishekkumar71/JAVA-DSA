import java.util.*;

public class KthLargestElement {
    static PriorityQueue<Integer> pq = new PriorityQueue<>();

    public static ArrayList getKthLargest(int arr[], int k) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int val : arr) { // VAL=ARR[i]
            if (pq.size() < k) {
                pq.add(val);
                System.out.print("_" + " ");
            }
            if (pq.peek() < val) {
                pq.remove();
                pq.add(val);
            }
            if (pq.size() == k) {
                list.add(pq.peek());
            }
        }
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> res = new ArrayList<>();
        int arr[] = new int[8];
        System.out.println("Enter elements:");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = 3;
        res = getKthLargest(arr, k);
        for (int val : res) {
            System.out.print(val + " ");
        }
    }
}
