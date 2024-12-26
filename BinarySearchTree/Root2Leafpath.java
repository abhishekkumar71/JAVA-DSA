import java.util.*;

public class Root2Leafpath {

    public static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node Insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data < val) {
            root.right = Insert(root.right, val);
        } else if (root.data > val) {
            root.left = Insert(root.left, val);
        }
        return root;
    }

    public static void Inorder(Node root) {
        if (root == null) {
            return;
        }
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }

    public static void PrintPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + "->");
        }
        System.out.println("NULL");
    }

    public static void root2Leaf(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }
        // STEP-1
        // ADD NODE TO PATH
        path.add(root.data);
        if (root.left == null && root.right == null) {
            PrintPath(path);
        }
        // LEFT SUBTREE
        root2Leaf(root.left, path);
        // RIGHTSUBTREE
        root2Leaf(root.right, path);
        // REMOVE - the last element is removed and backtracking is performed
        path.remove(path.remove(path.size() - 1));

    }

    public static void main(String[] args) {
        int values[] = { 8, 5, 3, 6, 10, 11, 14 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = Insert(root, values[i]);
        }
        Inorder(root);
        System.out.println();
        root2Leaf(root, new ArrayList<>());
    }

}
