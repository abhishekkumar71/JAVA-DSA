import java.util.*;

public class TwoSumBSTs {
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

    public static void addToList(ArrayList<Integer> list, Node root) {
        if (root == null) {
            return;
        }
        addToList(list, root.left);
        list.add(root.data);
        addToList(list, root.right);
    }

    public static void Sum(ArrayList<Integer> list, int k) {
        int p1 = list.get(0);
        int p2 = list.get(list.size() - 1);
        int sum = 0;

        while (p1 < p2) {
            sum = p1 + p2;
            if (sum < k) {
                p1 = p1 + 1;
            } else if (sum > k) {
                p2 = p2 - 1;

            }
            if (sum == k) {
                System.out.println("(" + p1 + "," + p2 + ")");
                p1 = p1 + 1;
                p2 = p2 + 1;
            }
        }
    }

    public static void main(String[] args) {
        int val[] = { 5, 3, 2, 4, 6, 8, 7 };
        Node root = null;
        for (int i : val) {
            root = insert(root, i);
        }
        inorder(root);
        System.out.println();
        ArrayList<Integer> list = new ArrayList<>();
        addToList(list, root);
        System.out.println(list);
        Sum(list, 9);
    }
}
