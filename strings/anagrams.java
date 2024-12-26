import java.util.Arrays;

public class anagrams {
    public static void main(String[] args) {
        String str = "race";
        String str1 = "care";
        if (str.length() == str1.length()) {

            char[] str2 = str.toCharArray();
            char[] str3 = str1.toCharArray();
            Arrays.sort(str2);
            Arrays.sort(str3);
            if (Arrays.equals(str2, str3)) {
                System.out.println("both the strings are anagrams");
            } else {
                System.out.println("both are not anagrams");
            }
        } else {
            System.out.println("the strings are not anagrams");
        }

    }
}
