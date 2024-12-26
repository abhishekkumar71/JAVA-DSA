import java.util.*;

public class SortByfrequency {
    public static String getString(String s) {
        TreeMap<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {

            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(
                (a, b) -> a.getValue() == b.getValue() ? a.getKey() - b.getKey() : b.getValue() - a.getValue());

        for (Map.Entry<Character, Integer> e : map.entrySet())
            pq.add(e);

        StringBuilder str = new StringBuilder();
        while (pq.size() != 0) {
            char c = pq.poll().getKey();
            int val = map.get(c);
            while (val != 0) {
                str.append(c);
                val--;
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String s = "tree";
        String ans = getString(s);
        System.out.println(ans);
    }
}
