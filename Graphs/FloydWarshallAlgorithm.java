import java.util.*;

public class FloydWarshallAlgorithm {
    static int INF = 99999;
    static int v = 4;

    public static void FloydWarshall(int graph[][]) {
        int dist[][] = new int[v][v];
        int i, j, k;
        for (i = 0; i < v; i++) {
            for (j = 0; j < v; j++) {
                dist[i][j] = graph[i][j];
            }
        }
        for (k = 0; k < v; k++) {
            for (i = 0; i < v; i++) {
                for (j = 0; j < v; j++) {
                    if (dist[i][j] > dist[i][k] + dist[k][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }
        PrintSolution(dist);
    }

    public static void PrintSolution(int dist[][]) {
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                if (dist[i][j] == INF) {
                    System.out.print(INF + " ");
                } else {
                    System.out.print(dist[i][j] + " ");
                }
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        int graph[][] = { { 0, 5, INF, 10 }, { INF, 0, 3, INF }, { INF, INF, 0, 1 }, { INF, INF, INF, 0 } };
        FloydWarshallAlgorithm a = new FloydWarshallAlgorithm();
        a.FloydWarshall(graph);
    }
}
