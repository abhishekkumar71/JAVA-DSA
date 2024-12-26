import java.util.*;

public class DuplicateTree {
    public static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }

    static HashMap<String, Integer> m=new HashMap<>();

    public static String Duplicate(Node root) {

        if (root == null) {
            return "";
        }
        String str = "(";
        str += Duplicate(root.left);
        str += Integer.toString(root.data);
        str += Duplicate(root.right);
        str += ")";
        if (m.get(str) != null && m.get(str) == 1) {
            System.out.println(root.data);
        }
        if (m.containsKey(str)) {
            m.put(str, m.get(str) + 1);
        } else {
            m.put(str, 1);
        }
        return str;
    }
    

    public static void main(String[] args) {
     //          1
       //      /   \
       //     4     3
       //    /     / \
       //   3     4   3
       //        /
       //       3
        Node root = new Node(1);
        root.left = new Node(4);
        root.right = new Node(3);
        root.left.left = new Node(3);
        root.right.left = new Node(4);
        root.right.left.left = new Node(3);
        root.right.right = new Node(3);
Duplicate(root);    }
}
