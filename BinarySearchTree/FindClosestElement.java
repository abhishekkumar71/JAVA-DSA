import java.util.*;

public class FindClosestElement {
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

    public static int ClosestElement(ArrayList<Integer> list, int k) {
        int closest = list.get(0);
        int minDiff = Math.abs(closest - k);
        for (int num : list) {// num represents each element in the list
            int currDiff = Math.abs(num - k);

            if (currDiff < minDiff) {
                minDiff = currDiff;
                closest = num;
            }
        }
        return closest;
    }

    public static void inorderTraversal(Node root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left, list);
        list.add(root.data);
        inorderTraversal(root.right, list);
    }

    public static void main(String[] args) {
        int val[] = { 5, 11, 3, 20, 6, 8 };
        Node root = null;
        for (int i = 0; i < val.length; i++) {
            root = insert(root, val[i]);
        }
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root);
        System.out.println();
        inorderTraversal(root, list);
        System.out.println(list);
        System.out.println(ClosestElement(list, 9));

    }
}
