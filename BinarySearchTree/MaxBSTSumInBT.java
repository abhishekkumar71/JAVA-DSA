public class MaxBSTSumInBT {
    public static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public static class Info {
        int max;
        int min;
        boolean isBST;
        int sum;
        int currmax;

        Info(int m, int mi, boolean is, int s, int curr) {
            max = m;
            min = mi;
            is = isBST;
            sum = s;
            currmax = curr;
        }

        Info() {
        };
    };

    static class INT {
        int a;
    }

    public static Info MaxSumBSTutil(Node root, INT maxsum) {
        if (root == null) {
            return new Info(Integer.MIN_VALUE, Integer.MAX_VALUE, true, 0, 0);
        }
        if (root.left == null && root.right == null) {
            maxsum.a = Math.max(maxsum.a, root.data);
            return new Info(root.data, root.data, true, root.data, maxsum.a);
        }
        Info L = MaxSumBSTutil(root.left, maxsum);
        Info R = MaxSumBSTutil(root.right, maxsum);
        Info BST = new Info();

        if (L.isBST && R.isBST && L.max < root.data && R.min > root.data) {
            BST.max = Math.max(root.data, Math.max(L.max, R.max));
            BST.min = Math.min(root.data, Math.min(L.min, R.min));
            maxsum.a = Math.max(maxsum.a, R.sum + root.data + L.sum);

            BST.sum = R.sum + root.data + L.sum;
            BST.currmax = maxsum.a;
            BST.isBST = true;
            return BST;
        }
        BST.isBST = false;
        BST.currmax = maxsum.a;
        BST.sum = R.sum + root.data + L.sum;
        return BST;

    }

    static int MaxSumBST(Node root) {
        INT maxsum = new INT();
        maxsum.a = Integer.MIN_VALUE;
        return MaxSumBSTutil(root, maxsum).currmax;
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
        Node root = new Node(5);
        root.left = new Node(9);
        root.left.left = new Node(6);
        root.left.left.left = new Node(8);
        root.left.left.right = new Node(7);

        root.right = new Node(2);
        root.right.right = new Node(3);
        inorder(root);
        System.out.println();
        System.out.println("The max sum of nodes of BST in the given BT: " + MaxSumBST(root));
    }

}
