import java.util.*;

class KthSmallestElement {
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

    public static void addToList(Node root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }
        addToList(root.left, list);
        list.add(root.data);
        addToList(root.right, list);
    }

    public static int Kthsmallest(ArrayList<Integer> list, int k) {
        return list.get(k - 1);
    }

    public static void main(String[] args) {
        int val[] = { 20, 8, 22, 4, 12, 10, 14 };
        Node root = null;
        for (int i : val) {
            root = insert(root, i);
        }
        inorder(root);
        System.out.println();
        ArrayList<Integer> list = new ArrayList<>();
        addToList(root, list);
        System.out.println(list);
        System.out.println(Kthsmallest(list, 3));
    }

}
