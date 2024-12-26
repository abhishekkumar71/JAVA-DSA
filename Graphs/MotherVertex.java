import java.util.*;

public class MotherVertex {
    public static void addEdge(int u, int v, ArrayList<ArrayList<Integer>> adj) {
        adj.get(u).add(v);
    }

    public static void DFS(ArrayList<ArrayList<Integer>> g, int v, boolean vis[]) {
        vis[v] = true;
        for (int x : g.get(v)) {
            if (!vis[x]) {
                DFS(g, x, vis);
            }
        }
    }

    public static int FindMotherVertex(ArrayList<ArrayList<Integer>> adj, int V) {
        boolean vis[] = new boolean[V];
        int v = -1;
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                DFS(adj, i, vis);
                v = i;
            }
        }
        boolean check[] = new boolean[V];
        DFS(adj, v, check);
        for (boolean val : check) {
            if (!val) {
                return -1;
            }
        }
        return v;
    }

    public static void main(String[] args) {
        int V = 7;
        int E = 8;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        addEdge(0, 1, adj);
        addEdge(0, 2, adj);
        addEdge(1, 3, adj);
        addEdge(4, 1, adj);
        addEdge(6, 4, adj);
        addEdge(5, 6, adj);
        addEdge(5, 2, adj);
        addEdge(6, 0, adj);
        System.out.println("The Mother Vertex of the Graph: " + FindMotherVertex(adj, V));
    }
}
