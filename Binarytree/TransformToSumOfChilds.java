
public class TransformToSumOfChilds {
    public static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int Transform(Node root) {
        if (root == null) {
            return 0;
        }
        int leftchild = Transform(root.left);
        int rightchild = Transform(root.right);
        int newleft, newright;
        if (root.left == null) {
            newleft= 0;
        } else {
            newleft = root.left.data;
        }
        if (root.right == null) {
            newright= 0;
        } else {
            newright = root.right.data;
        }
        int data = root.data;
        root.data = newleft + leftchild + newright + rightchild;
        return data;
    }

    // TO PRINT
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        Transform(root);
        preorder(root);

    }
}
