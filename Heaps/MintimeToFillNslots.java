import java.util.*;

/**
 * MintimeToFillNslots
 */
public class MintimeToFillNslots {

    static class Pair implements Comparable<Pair> {
        int val;
        int time;

        public Pair(int val, int time) {
            this.val = val;
            this.time = time;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.time - p2.time;
        }
    }

    public static void minTime(int arr[], int N, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        boolean vis[] = new boolean[N + 1];

        for (int i = 0; i < k; i++) {
            pq.add(new Pair(arr[i], 0));
            vis[arr[i]] = true;
        }

        int time = 0;
        while (!pq.isEmpty()) {
            Pair curr = pq.remove(); // Corrected the usage of pq.remove()
            int pos = curr.val;
            time = curr.time;

            if (pos - 1 >= 1 && !vis[pos - 1]) {
                vis[pos - 1] = true;
                pq.add(new Pair(pos - 1, time + 1));
            }
            if (pos + 1 <= N && !vis[pos + 1]) {
                vis[pos + 1] = true;
                pq.add(new Pair(pos + 1, time + 1));
            }
        }
        System.out.println(time);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 6 };
        int N = 6;
        int k = arr.length;
        minTime(arr, N, k);
    }
}
