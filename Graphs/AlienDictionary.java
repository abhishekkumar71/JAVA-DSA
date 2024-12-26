import java.util.*;

public class AlienDictionary {
    public static ArrayList<Integer>[] Create(String words[], int n, int k, int inorder[]) {
        ArrayList<Integer> graph[] = new ArrayList[k];
        for (int i = 0; i < k; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < n - 1; i++) {
            String word1 = words[i];
            String word2 = words[i + 1];
            int minlen = Math.min(word1.length(), word2.length());

            for (int j = 0; j < minlen; j++) {
                if (word1.charAt(j) != word2.charAt(j)) {

                    int u = word1.charAt(j) - 'a';
                    int v = word2.charAt(j) - 'a';
                    graph[u].add(v);
                    inorder[v]++;
                    break;
                }
            }
        }
        return graph;
    }

    public static boolean findOrder(ArrayList<Integer> graph[], int inorder[], int k) {
        Queue<Integer> q = new LinkedList<>();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < k; i++) {
            if (inorder[i] == 0) {
                q.add(i);
            }
        }
        while (!q.isEmpty()) {
            int u = q.remove();
            result.append((char) (u + 'a'));
            for (int v : graph[u]) {
                inorder[v]--;
                if (inorder[v] == 0) {
                    q.add(v);
                }
            }
        }
        if (result.length() == k) {
            String ans = result.toString();
            System.out.println(ans);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String dist[] = { "baa", "abcd", "abca", "cab", "cad" };
        int n = dist.length;
        int k = 4;
        int inorder[] = new int[k];
        ArrayList<Integer> graph[] = new ArrayList[k];
        graph = Create(dist, n, k, inorder);
        if (findOrder(graph, inorder, k)) {
            System.out.println("1");
        }
        if (!findOrder(graph, inorder, k)) {
            System.out.println("0");
        }
    }
}
