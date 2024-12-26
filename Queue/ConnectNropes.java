import java.util.*;

public class ConnectNropes {
    public static void mincost(int arr[], int n) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            pq.add(arr[i]);
        }
        int res = 0;
        while (pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();
            res += first + second;
            pq.add(first + second);
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        int arr[] = { 4, 3, 2, 6 };
        int n = arr.length;
        mincost(arr, n);
    }
}
