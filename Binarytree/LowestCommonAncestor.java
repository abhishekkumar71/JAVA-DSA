import java.util.*;

public class LowestCommonAncestor {

    public static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean getpath(Node root, int n, ArrayList<Node> path) {
        if (root == null) {
            return false;
        }

        path.add(root); //ADDING THE ROOT ELEMENT TO THE PATH

        if (root.data == n) {
            return true;
        }
        boolean leftpath = getpath(root.left, n, path);
        boolean rightpath = getpath(root.right, n, path);
        if (leftpath || rightpath) {
            return true;
        }
        path.remove(path.size() - 1); // IT MEANS THAT THE NODE WE ARE SEARCHING DOESNOT EXIST IN THIS PATH
        return false;
    }

    public static Node lca(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();
        getpath(root, n1, path1);
        getpath(root, n2, path2);
        int i = 0;
        for (; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }
        return path1.get(i - 1);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int n1 = 4, n2 = 5;
        System.out.println(lca(root, n1, n2).data);
    }
}