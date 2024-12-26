public class LongestWordInDictionary {
    public static class Node {
        Node children[] = new Node[26];
        boolean eow;
        String finalword;

        public Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            this.finalword = "";
            this.eow = false;
        }
    }

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
        curr.finalword = word;
    }

    public static Node root = new Node();
    static String ans = "";

    public static void findLongestWord(Node root) {
        if (root.finalword.length() > ans.length()) {
            ans = root.finalword;
        } else if (root.finalword.length() == ans.length() && root.finalword.compareTo(ans) < 0) {
            ans = root.finalword;
        }
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null && root.children[i].eow == true) {
                findLongestWord(root.children[i]);
            }
        }
    }

    
    public static void main(String[] args) {
        String words[] = { "a", "ap", "banana", "app", "appl","apple" };
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
        findLongestWord(root);
        System.out.println(ans);
    }
}
