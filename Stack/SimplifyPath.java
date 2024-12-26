import java.util.*;

/**
 * SimplifyPath
 */
public class SimplifyPath {
    public static String Simplify(String str) {
        Stack<String> s = new Stack<String>();
        String res = "";
        res += "/";
        int len = str.length();
        for (int i = 0; i < len; i++) {
            String dir = "";
            while (i <len && str.charAt(i) != '/') {
                dir += str.charAt(i);
                i++;
            }
            while (i < len && str.charAt(i) == '/') {
                i++;
            }
            if (dir.equals("..") == true) {
                if (!s.empty()) {

                    s.pop();
                }
            else if (dir.equals(".") == true) {
                continue;
            } 
            } else if (dir.length() != 0)
                s.push(dir);

        }
        Stack<String> s1 = new Stack<String>();
        while (!s.empty()) {
            s1.push(s.pop());
        }
        while (!s1.empty()) {
            if (s1.size() != 1) {
                res += (s1.pop() + "/");
            } else {
                res += s1.pop();
            }

        }
        return res;

    }

    public static void main(String[] args) {
        String str = new String("/apnacollege/");
        String res = Simplify(str);
        System.out.println(res);
    }
}