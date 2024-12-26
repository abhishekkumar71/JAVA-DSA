public class RangeSumOfBST {
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
        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static int findRangeSum(Node root, int low, int high) {
        if (root == null) {
            return 0;
        } 
            int sum = 0;
            if (low <= root.data && high >= root.data) {
                sum += root.data;
            }
            if (high > root.data) {
                sum += findRangeSum(root.right, low, high);
            } 
             if (low < root.data)
            {
                sum += findRangeSum(root.left, low, high);
            }

            return sum;
        
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
        int val[] = { 8, 3, 5, 6, 20, 11 };
        Node root = null;
        for (int i = 0; i < val.length; i++) {
            root = insert(root, val[i]);
        }
        inorder(root);
        System.out.println();
        System.out.println("sum of nodes in the  range between low and high: "+findRangeSum(root, 4, 15));
    }
}
