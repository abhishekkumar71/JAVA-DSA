
public class MirrorOfaBST {
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

    public static void Preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");

        Preorder(root.left);
        Preorder(root.right);
    }

    public static Node Mirror(Node root) {
        if (root == null) {
            return null;
        }
        Node leftmirror = Mirror(root.left);
        Node rightmirror = Mirror(root.right);
        root.left = rightmirror;
        root.right = leftmirror;
        return root;
    }

    public static void main(String[] args) {
        int values[] = { 8, 5, 3, 4, 10, 11, 14 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = Insert(root, values[i]);
        }
        Preorder(root);
        System.out.println();
        root = Mirror(root);
        Preorder(root);
    }
}
