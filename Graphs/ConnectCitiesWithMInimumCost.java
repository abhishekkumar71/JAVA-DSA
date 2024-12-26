
/**
 * ConnedtCitiesWithMInimumCost
 */
import java.util.*;

public class ConnectCitiesWithMInimumCost {
    public static class Pair implements Comparable<Pair> {
        int dest;
        int cost;

        public Pair(int dest, int cost) {
            this.dest = dest;
            this.cost = cost;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.cost - p2.cost;
        }
    }

    public static int ConnectCities(int cities[][]) {
        boolean vis[] = new boolean[cities.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0, 0));
        int finalcost = 0;
        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            if (!vis[curr.dest]) {
                vis[curr.dest] = true;
                finalcost += curr.cost;
                for (int i = 0; i < cities[curr.dest].length; i++) {
                    if (cities[curr.dest][i] != 0) {
                        pq.add(new Pair(i, cities[curr.dest][i]));
                    }
                }
            }
        }
        return finalcost;
    }

    public static void main(String[] args) {
        int cities[][] = { { 0, 1, 2, 3, 4 },
                { 1, 0, 5, 0, 7 },
                { 2, 5, 0, 6, 0 },
                { 3, 0, 6, 0, 0 },
                { 4, 7, 0, 0, 0 } };
        System.out.println("The minimum cost to connect cities: " + ConnectCities(cities));
    }
}