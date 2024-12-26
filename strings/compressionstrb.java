/**
 * compressionstrb
 */
public class compressionstrb {
    public static StringBuilder compression(String str) {
        StringBuilder newstr = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newstr = newstr.append(str.charAt(i));
            if (count > 1) {
                newstr = newstr.append(count);
            }
        }
        return newstr;
    }

    public static void main(String[] args) {
        String str = "aaabbbcdd";
        System.out.println(compression(str));
    }
}