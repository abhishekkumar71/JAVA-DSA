
import java.util.*;

public class GroupAnagrams {
    static class Node {
        Node[] children = new Node[26];
        List<String> words = new ArrayList<>(); // Store actual words at each end-of-word node

        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    // Insert a sorted version of the word into the trie and store the original word at the eow node
    public static void insert(String word, String originalWord) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        // Add the original word at the end of the sorted path
        curr.words.add(originalWord);
    }

    // Traverse the trie and collect groups of anagrams
    public static void traverseAndGroup(Node root, List<List<String>> result) {
        if (root == null) return;

        // If there are words stored at this node, it means we've reached a grouping of anagrams
        if (!root.words.isEmpty()) {
            result.add(new ArrayList<>(root.words)); // Add the group of anagrams to the result
        }

        // Recur for all children
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null) {
                traverseAndGroup(root.children[i], result);
            }
        }
    }

    // Main method to group anagrams using the trie
    public static List<List<String>> groupAnagrams(String[] arr) {
        // Insert each word into the trie after sorting its characters
        for (String word : arr) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);  // This will be the path in the trie
            insert(sortedWord, word);                   // Insert sorted word, but store original word
        }

        // List to store groups of anagrams
        List<List<String>> result = new ArrayList<>();

        // Traverse the trie and collect the anagrams
        traverseAndGroup(root, result);

        return result;
    }

    public static void main(String[] args) {
        String[] arr = { "eat", "ate", "tan", "nat", "bat", "tab" };

        List<List<String>> result = groupAnagrams(arr);

        // Print the grouped anagrams
        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}
