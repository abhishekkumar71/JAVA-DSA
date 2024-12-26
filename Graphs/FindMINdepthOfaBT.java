import java.util.*;

public class FindMINdepthOfaBT {
    public static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void findDepth(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int depth = 1;
        while (!q.isEmpty()) {

            for (int i = 0; i < q.size(); i++) {

                Node curr = q.remove();
                if (curr.left == null && curr.right == null) {
                    System.out.println("Minimum Depth of the Binary Tree: " + depth);
                    return;
                }
                if (curr.left != null) {

                    q.add(curr.left);
                }
                if (curr.right != null) {

                    q.add(curr.right);
                }
            }
            depth++;

        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(8);
        root.right = new Node(2);
        root.left.left = new Node(6);
        root.left.left.left = new Node(60);
        root.left.right = new Node(5);
        root.right.left = new Node(9);
        findDepth(root);
    }
}
