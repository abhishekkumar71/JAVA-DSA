import java.util.*;

public class SlidingWindow {
    static class Pair implements Comparable<Pair> {
        int val;
        int idx;

        public Pair(int val, int idx) {
            this.val = val;
            this.idx = idx;
        }

        @Override
        public int compareTo(Pair p2) {
            return p2.val - this.val;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");

        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter array elements: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = 3;

        int res[] = new int[arr.length - k + 1];
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        // STEP-1: ADD TO PQ
        for (int i = 0; i < k; i++) {
            pq.add(new Pair(arr[i], i));
        }
        // STEP-2:
        int wind = res[0];
        for (int i = k; i < arr.length; i++) {
            while (pq.size() > 0 && pq.peek().val <= i - k) {
                pq.remove();
            }
            pq.add(new Pair(arr[i], i));
            res[i - k + 1] = pq.peek().val;
        }

        // PRINT
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
        System.out.println();
    }
}
