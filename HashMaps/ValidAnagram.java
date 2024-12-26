import java.util.*;

public class ValidAnagram {

    public static boolean isValidAnagram(String s, String t) {
        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (hm.get(ch) != null) {
                if (hm.get(ch) == 1) {
                    hm.remove(ch);
                } else {
                    hm.put(ch, hm.get(ch) - 1);
                }
            } else {
                return false;
            }
        }
        return hm.isEmpty();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int size = sc.nextInt();
        sc.nextLine(); // CONSUMES THE NEWLINE CHARACTER

        System.out.println("Enter s: ");
        String s = sc.nextLine();
        System.out.println("Enter t: ");
        String t = sc.nextLine();
        System.out.println(isValidAnagram(s, t));
    }
}
