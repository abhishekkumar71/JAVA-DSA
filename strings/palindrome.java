/**
 * palindrome
 */
public class palindrome {

    public static boolean palindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        String str = "racer";
        if (palindrome(str)) {
            System.out.println("string is a palindrome");
        } else {
            System.out.println("string is not a palindrome");
        }
    }
}