import java.util.*;

public class PossibleToFinishATask {
    public static ArrayList<Integer>[] Create(int n, int prerequisites[][]) {
        ArrayList<Integer> graph[] = new ArrayList[n];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int arr[] : prerequisites) {
            int u = arr[0];
            int v = arr[1];
            graph[u].add(v);
        }
        return graph;
    }

    public static boolean isCycle(ArrayList<Integer> graph[], int n) {
        int indegree[] = new int[n];

        for (int i = 0; i < n; i++) {
            for (int neighbour : graph[i]) {
                indegree[neighbour]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }
        int count = 0;
        while (!q.isEmpty()) {
            int curr = q.remove();
            count++;
            for (int neighbour : graph[curr]) {
                indegree[neighbour]--;
                if (indegree[neighbour] == 0) {
                    q.add(neighbour);
                }
            }
        }
        return count != n;
    }

    public static boolean Possible(int n, int prerequisites[][]) {
        if (n==0) {
            return true;
        }
        ArrayList<Integer> graph[] = Create(n, prerequisites);
        return !isCycle(graph, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of tasks:");
        int n = sc.nextInt();
        System.out.println("Enter P:");
        int p = sc.nextInt();
        int prerequisites[][] = new int[p][2];
        System.out.println("Enter prerequisites: ");
        for (int i = 0; i < p; i++) {
            prerequisites[i][0] = sc.nextInt();
            prerequisites[i][1] = sc.nextInt();

        }
        if (Possible(n, prerequisites)) {
            System.out.println("Possible");
        } else {
            System.out.println("cannot be possible");
        }
    }
}