
/**
 * HashMapOperations
 */
import java.util.*;

public class HashMapOperations {
    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<>();
        // PUT -0(1)
        hm.put("India", 100);
        hm.put("China", 120);
        hm.put("UK", 50);
        hm.put("USA", 75);
        System.out.println(hm);

        // GET-O(1)
        System.out.println(hm.get("India"));
        System.out.println(hm.get("China"));
        System.out.println(hm.get("Indonesia"));// RETURNS NULL INDONESIA DOESN'T EXIST IN hm

        // CONTAIN-O(1)
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Indonesia"));

        // REMOVE -O(1)
        hm.remove("China");
        System.out.println(hm);

        // SIZE
        System.out.println(hm.size());

        // CLEAR
        hm.clear();

        // IS EMPTY
        System.out.println(hm.isEmpty());
    }
}