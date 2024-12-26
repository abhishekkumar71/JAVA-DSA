import java.util.*;

public class WordLadder {
    public static boolean differBy1char(String str1, String str2) {
        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                count++;
            }
            if (count > 1) {
                return false;
            }
        }
        return count == 1;
    }

    public static List<List<Integer>> CreateGraph(List<String> dictionary) {
        int n = dictionary.size();
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        // CREATING EDGES
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (differBy1char(dictionary.get(i), dictionary.get(j))) {
                    graph.get(i).add(j);
                    graph.get(j).add(i);
                }
            }
        }
        return graph;
    }

    public static int findSmallestChain(List<String> dictionary, String start, String target) {
        if (!dictionary.contains(target)) {
            return -1;
        }
        if (!dictionary.contains(start)) {
            dictionary = new ArrayList<>(dictionary);
            dictionary.add(start);
        }
        int startIndex = dictionary.indexOf(start);
        int targetIndex = dictionary.indexOf(target);

        List<List<Integer>> graph = CreateGraph(dictionary);
        // BFS
        Queue<Integer> q = new LinkedList<>();
        q.add(startIndex);
        int dist[] = new int[dictionary.size()];
        Arrays.fill(dist, -1);

        dist[startIndex] = 1;
        while (!q.isEmpty()) {
            int curr = q.remove();
            int currDist = dist[curr];

            if (curr == targetIndex) {
                return currDist;
            }
            for (int neighbour : graph.get(curr)) {
                if (dist[neighbour] == -1) {
                    dist[neighbour] = currDist + 1;
                    q.add(neighbour);
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        List<String> dictionary = Arrays.asList("POON", "PLEA", "PLEE", "SAME", "POIE", "POIN", "PLIE");
        String start = "TOON";
        String target = "PLEA";
        System.out.println("Smallest Chain length: " + findSmallestChain(dictionary, start, target));
    }

}