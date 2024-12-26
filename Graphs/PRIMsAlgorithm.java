import java.util.*;

public class PRIMsAlgorithm {
    static class Pair implements Comparable<Pair> {
        int cost;
        int vertex;

        public Pair(int vertex, int cost) {
            this.cost = cost;
            this.vertex = vertex;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.cost - p2.cost;
        }

        public String toString() {
            return "Vertex: " + vertex + ", Cost: " + cost;
        }
    }

    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void Create(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        graph[2].add(new Edge(2, 3, 50));
        graph[2].add(new Edge(2, 0, 15));

        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));
    }

    public static void Prims(ArrayList<Edge> graph[]) {
        boolean vis[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0, 0));
        ArrayList<Pair> list = new ArrayList<>();

        int finalcost = 0;
        while (!pq.isEmpty()) {
            Pair curr = pq.remove();

            if (!vis[curr.vertex]) {

                vis[curr.vertex] = true;
                list.add(new Pair(curr.vertex, curr.cost));
                finalcost += curr.cost;

                for (int i = 0; i < graph[curr.vertex].size(); i++) {
                    Edge e = graph[curr.vertex].get(i);
                    pq.add(new Pair(e.dest, e.wt));

                }
            }
        }
        System.out.println(finalcost);
        for (Pair p : list) {
            System.out.println(p);
        }
    }

    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge> graph[] = new ArrayList[v];
        Create(graph);
        Prims(graph);
    }
}
