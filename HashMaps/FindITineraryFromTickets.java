import java.util.*;

public class FindITineraryFromTickets {
    public static String getStart(HashMap<String, String> map) {
        HashMap<String, String> rev = new HashMap<>();
        for (String key : map.keySet()) {
            rev.put(map.get(key), key);
        }
        for (String key : map.keySet()) {
            if (!rev.containsKey(key)) {
                return key;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("chennai", "banglore");
        map.put("mumbai", "delhi");
        map.put("goa", "chennai");
        map.put("delhi", "goa");

        String start = getStart(map);
        System.out.print(start);

        for (String key : map.keySet()) {
            System.out.print("->" + map.get(start));
            start = map.get(start);
        }
        System.out.println();
    }
}
