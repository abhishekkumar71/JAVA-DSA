public class findingsubset {
    public static void subset(String str, int i, String ans) {
        // BASE CASE
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }
        // YES CHOICE
        subset(str, i + 1, ans + str.charAt(i));
        // NO CHOICE
        subset(str, i + 1, ans);
    }

    public static void main(String[] args) {
        String str = "abc";
        String ans = new String();
        subset(str, 0, ans);
    }
}
