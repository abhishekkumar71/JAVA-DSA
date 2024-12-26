import java.util.*;

public class LinkedHashMaps {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("China", 150);
        lhm.put("UK", 50);
        lhm.put("USA", 75);
        lhm.put("Canada", 50);
        System.out.println(lhm);

    }
}
