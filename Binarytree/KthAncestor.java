public class KthAncestor {
    public static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int kthancestor(Node root, int n, int k) {
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }
        int leftDist = kthancestor(root.left, n, k);
        int rightDist = kthancestor(root.right, n, k);
        int max = Math.max(leftDist, rightDist);
        if (leftDist == -1 && rightDist == -1) {
            return -1;
        }
        if ((max + 1) == k) {
            System.out.println("The Kth Ancestor of the given node: " + root.data);
        }
        return max + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        kthancestor(root, 5, 1);
    }
}
