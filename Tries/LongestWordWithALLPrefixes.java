public class LongestWordWithALLPrefixes {
    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;

        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();
    public static String ans = "";

    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static void LongestWord(Node root, StringBuilder temp) {
        if (root == null) {
            return;
        }
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null && root.children[i].eow) {
                char ch = (char) (i + 'a');
                temp.append(ch);

                if (temp.length() > ans.length()) {
                    ans = temp.toString();
                }
                LongestWord(root.children[i], temp);
                temp.deleteCharAt(temp.length() - 1); // BACKTRACKING
            }
        }
    }

    public static void main(String[] args) {
        String word[] = { "a", "ap", "app", "appl", "apple", "apply", "banana" };
        for (int i = 0; i < word.length; i++) {
            insert(word[i]);
        }
        LongestWord(root, new StringBuilder(""));
        System.out.println(ans);
    }
}
