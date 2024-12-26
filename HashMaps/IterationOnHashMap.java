import java.util.*;

public class IterationOnHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("USA", 75);
        hm.put("UK", 50);

        Set<String> keys = hm.keySet();
        for (String k : keys) {
            System.out.println("Country: " + k + " population: " + hm.get(k));
        }

    }
}
