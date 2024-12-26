public class MaxPathSumInATree {
    public static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class result {
        public int val;
    }

    public static int FindMaxUtil(Node root, result res) {
        if (root == null) {
            return 0;
        }
        int l = FindMaxUtil(root.left, res);
        int r = FindMaxUtil(root.right, res);
        int max_single = Math.max(Math.max(l, r) + root.data, root.data);
        int max_top = Math.max(max_single, l + r + root.data);
        res.val = Math.max(res.val, max_top);
        return max_single;
    }

    public static int FindMax(Node root) {
        result res = new result();
        res.val = Integer.MIN_VALUE;
        FindMaxUtil(root, res);
        return res.val;
    }

    public static void main(String[] args) {
        //           10
        //          /  \
        //         9    3
        //        /    / \
        //       3    4    5
        Node root = new Node(10);
        root.left = new Node(9);
        root.right = new Node(3);
        root.left.left = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(5);
        System.out.println(FindMax(root));
    }
}
