import java.util.*;

public class CycleDetectionUsingFINDandUNION {
    static class Edge {
        int src, dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    static int n = 5;
    static int par[] = new int[n];
    static int rank[] = new int[n];

    public static int find(int x) {
        if (par[x] == x) {
            return x;
        }
        return par[x] = find(par[x]);
    }

    public static void union(int a, int b) {
        for (int i = 0; i < rank.length; i++) {
            rank[i] = 0;
        }
        int parA = find(a);
        int parB = find(b);
        if (parA == parB) {
            return;
        }
        if (rank[parA] == rank[parB]) {
            par[parB] = parA;
            rank[parA]++;
        } else if (rank[parA] > rank[parB]) {
            par[parB] = parA;
        } else {
            par[parA] = parB;
        }
    }

    public static boolean isCycle(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            for (Edge e : graph[i]) {
                int u = find(e.src);
                int v = find(e.dest);
                if (u == v) {
                    return true;
                } else {
                    union(u, v);
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Edge> graph[] = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < n; i++) {
            par[i] = i;
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 2));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 4));
        if (isCycle(graph)) {
            System.out.println("Cycle Exists..");
        } else {
            System.out.println("Cycle Doesn't Exist");
        }
    }
}