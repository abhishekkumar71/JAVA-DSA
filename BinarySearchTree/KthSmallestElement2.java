/**
 * KthSmallestElement2
 */
public class KthSmallestElement2 {

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
        } else {
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

    static int count = 0;

    public static Node findKthSmallest(Node root, int k) {
        if (root == null) {
            return null;
        }
        Node left = findKthSmallest(root.left, k);
        if (left != null) {
            return left;
        }
        count++;
        if (count == k) {
            return root;
        }
        return findKthSmallest(root.right, k);
    }

    public static void main(String[] args) {
        int val[] = { 20, 8, 22, 4, 12, 10, 14 };
        Node root = null;
        for (int i : val) {
            root = insert(root, i);
        }
        inorder(root);
        System.out.println();
        Node node = findKthSmallest(root, 3);
        System.out.println(node.data);
    }
}