public class PrintInRange {
    public static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data < val) {
            root.right = insert(root.right, val);
        } else if (root.data > val) {
            root.left = insert(root.left, val);
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void Print(Node root, int k1, int k2) {
        // SEARCH IN BOTH SUBTREES
        if (root == null) {
            return;
        }
        if (root.data >= k1 && root.data <= k2) {
            Print(root.left, k1, k2);
            System.out.print(root.data + " ");
            Print(root.right, k1, k2);
        }
        // CASE-2: SEARCH IN LEFT SUBTREE
       else if (root.data < k1) {
            Print(root.right, k1, k2);
        }
        // CASE-3: SEARCH IN RIGHT SUBTREE
        else {
            Print(root.left, k1, k2);
        }
    }

    public static void main(String[] args) {
        int values[] = { 8, 5, 6, 1, 4, 10, 11, 14 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();
        Print(root, 7, 12);
    }
}
