import java.util.*;

public class FindClosestElementUsingStack {
    public static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public static int Findclosest(Node root, int target) {
        if (root == null) {
            return 0;
        }
        int pred = Integer.MIN_VALUE;
        LinkedList<Node> stack = new LinkedList<>();
        while (!stack.isEmpty() || root != null) {

            while (root != null) {
                stack.add(root);
                root = root.left;
            }
            root = stack.pop();

            if (pred <= target && root.data > target) {
                return Math.abs(pred - target) <= Math.abs(root.data - target) ? pred : root.data;
            }
            pred = root.data;
            root = root.right;
        }
        return pred;
    }

    public static Node Insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            // LEFT SUBTREE
            root.left = Insert(root.left, val);
        } else {
            // RIGHT SUBTREE
            root.right = Insert(root.right, val);

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

    public static void main(String[] args) {
        int values[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;
        // TO INSERT NODES
        for (int i = 0; i < values.length; i++) {
            root = Insert(root, values[i]);
        }
        inorder(root);
        System.out.println();
        System.out.println("The closest element of the target :" + Findclosest(root, 6));
    }
}
