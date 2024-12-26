public class DeleteLeaves {
    public static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node Delete(Node root, int n) {
        if (root == null) {
            return null;
        }
        root.left = Delete(root.left, n);
        root.right = Delete(root.right, n);
        if (root.data == n && root.left == null && root.right == null) {
            return null;
        }
        return root;
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(4);
        root.right.right = new Node(4);
        root.left.left.left = new Node(3);
        preorder(root);
        Delete(root, 4);
        System.out.println();
        preorder(root);
    }
}
