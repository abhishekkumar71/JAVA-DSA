public class CountofTree {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
//      1
    // / \
    // 2  3
 //   / \ / \
//   4  5 6  7
    public static int count(Node root) {
        if (root == null) {
            return 0;
        }
        int leftcount = count(root.left);
        int rightcount = count(root.right);
        return leftcount + rightcount + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println("count of nodes:"+count(root));
    }
}
