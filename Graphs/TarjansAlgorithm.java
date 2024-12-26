import java.util.*;

public class TarjansAlgorithm {
    static int time;

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static void ApUtil(ArrayList<ArrayList<Integer>> adj, int u, boolean visited[], int disc[], int low[], int parent,
            boolean isAP[]) {
        int children = 0;
        visited[u] = true;
        disc[u] = low[u] = time++;
        for (Integer v : adj.get(u)) {
            if (!visited[v]) {
                children++;
                ApUtil(adj, v, visited, disc, low, u, isAP);
                low[u] = Math.min(low[u], low[v]);
                if (parent != -1 && low[v] >= disc[u]) {
                    isAP[u] = true;
                }
            } else if (v != parent) {
                low[u] = Math.min(low[u], disc[v]);
            }
        }
        if (parent == -1 && children > 1) {
            isAP[u] = true;
        }

    }

    static void AP(ArrayList<ArrayList<Integer>> adj, int v) {
        boolean visited[] = new boolean[v];
        int disc[] = new int[v];
        int low[] = new int[v];
        boolean isAP[] = new boolean[v];
        int par = -1;
        for (int u = 0; u < v; u++) {
            if (visited[u] == false) {
                ApUtil(adj, u, visited, disc, low, par, isAP);
            }
        }

        for (int u = 0; u < v; u++) {
            if (isAP[u] == true) {
                System.out.println(u);
            }
        }

    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<ArrayList<Integer>> adj1 = new ArrayList<>(v);
        for (int i = 0; i < v; i++) {
            adj1.add(new ArrayList<Integer>());
        }
        addEdge(adj1, 1, 0);
        addEdge(adj1, 0, 2);
        addEdge(adj1, 2, 1);
        addEdge(adj1, 0, 3);
        addEdge(adj1, 3, 4);
        AP(adj1, v);

    }
}
