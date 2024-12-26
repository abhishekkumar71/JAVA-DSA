import java.util.*;

public class ValidParentheses {
    public static boolean Valid(String str, Stack<Character> s) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // FOR OPENING BRACKETS
            if (ch == '[' || ch == '{' || ch == '(') {
                s.push(ch);
            } else {
                // FOR CLOSING BRACKETS
                if (s.isEmpty()) {
                    return false;
                }
                if ((s.peek() == '[' && ch == ']') || (s.peek() == '{' && ch == '}')
                        || (s.peek() == '(' && ch == ')')) {
                    s.pop();
                } else {
                    return false;
                }

            }
        }
        if (s.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();
        String str = "({[]})";
        System.out.println(Valid(str, s));
    }
}
