import java.util.*;

public class RedBlackTree {
    public static Node root;

    public RedBlackTree() {
        super();
        root = null;
    }

    class Node {
        int data;
        Node left, right, parent;
        char colour;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
            this.colour = 'R'; // either R or B
            this.parent = null;
        }
    }

    public static Node rotateLeft(Node node) {
        Node x = node.right;
        Node y = x.left;

        // ROTATION
        x.left = node;
        node.right = y;
        node.parent = x;

        if (y != null) {
            y.parent = node;
        }
        return (x);
    }

    public static Node rightRotate(Node node) {
        Node x = node.left;
        Node y = x.right;

        // ROTATION
        x.right = node;
        node.left = y;
        node.parent = x;

        if (y != null) {
            y.parent = node;
        }
        return (x);
    }

    // THERE ARE SOME FLAGS
    // ROTATIONS ARE PERFORMED IF FLAGS ARE TRUE

    boolean ll = false;
    boolean rr = false;
    boolean lr = false;
    boolean rl = false;

    public Node insertHelp(Node root, int data) {
        boolean f = false;

        if (root == null) {
            return (new Node(data));
        } else if (data < root.data) {
            root.left = insertHelp(root.left, data);
            root.left.parent = root;
            if (root != this.root) {
                if (root.colour == 'R' && root.left.colour == 'R') {
                    f = true;
                }
            }
        } else {
            root.right = insertHelp(root.right, data);
            root.right.parent = root;

            if (root != this.root) {
                if (root.colour == 'R' && root.right.colour == 'R') {
                    f = true;
                }
            }
        }
        if (this.ll) {
            root = rotateLeft(root);
            root.colour = 'B';
            root.left.colour = 'R';
            this.ll = false;
        } else if (this.rr) {
            root = rightRotate(root);
            root.colour = 'B';
            root.right.colour = 'R';
            this.rr = false;
        } else if (this.rl) {
            root.right = rightRotate(root.right);
            root.right.parent = root;
            root = rotateLeft(root);
            root.colour = 'B';
            root.left.colour = 'R';
            this.rl = false;
        } else if (this.lr) {
            root.left = rotateLeft(root.left);
            root.left.parent = root;
            root = rotateLeft(root);
            root.colour = 'B';
            root.right.colour = 'R';
            this.lr = false;
        }

        // WHEN ROTATION AND RECOLURING IS DONE FLAGS ARE RESET
        // NOW LETS TAKE CARE OF RED RED CONFLICT

        if (f) {
            // TO CHECK WHICH CHILD IF THE CURRENT NODE OF ITS PARENT
            if (root.parent.right == root) {
                // CASE WHEN PARENT'S SIBLING IS BLACK
                if (root.parent.left == null || root.parent.left.colour == 'B') {
                    if (root.left != null && root.left.colour == 'R') {
                        this.rl = true;
                    } else if (root.right != null && root.right.colour == 'R') {
                        this.ll = true;
                    }
                } else {
                    root.parent.left.colour = 'B';
                    root.colour = 'B';
                    if (root.parent != this.root) {
                        root.parent.colour = 'R';
                    }
                }
            }

            else {
                if (root.parent.right == null || root.parent.right.colour == 'B') {
                    if (root.left != null && root.left.colour == 'R')
                        this.rr = true;
                    else if (root.right != null && root.right.colour == 'R')
                        this.lr = true;
                } else {
                    root.parent.right.colour = 'B';
                    root.colour = 'B';
                    if (root.parent != this.root)
                        root.parent.colour = 'R';
                }
            }
            f = false;
        }
        return (root);
    }



    // FUNCTIONS TO INSERT DATA INTO TREE
    public void insert(int data) {
        if (this.root == null) {
            this.root = new Node(data);
            this.root.colour = 'B';
        } else {
            this.root = insertHelp(this.root, data);
        }
    }

    // HELPER FUNCTION TO PRINT ORDER TRAVERSAL
    public void inorderTraversalHelper(Node node) {
        if (node != null) {
            inorderTraversalHelper(node.left);
            System.out.println(node.data);
            inorderTraversalHelper(node.right);
        }
    }

    // FUUNCTION TO PRINT INORDER TRAVERSAL
    public void inorderTraversal() {
        inorderTraversalHelper(this.root);
    }

    // HELPER FUNCTION TO PRINT THE TREE
    public static void printTreeHelper(Node root, int space) {
        int i;
        if (root != null) {
            space = space + 10;
            printTreeHelper(root.right, space);
            System.out.println();
            for (i = 0; i < space; i++) {
                System.out.println();
            }
            System.out.println(root.data);
            System.out.println();
            printTreeHelper(root.left, space);
        }
    }

    // FUNCTION TO PRINT THE TREE
    public void printTree() {
        printTreeHelper(this.root, 0);
    }

    public static void main(String[] args) {
        RedBlackTree t = new RedBlackTree();
        int arr[] = { 1, 4, 6, 3, 5, 7, 8, 2, 9 };
        for (int i = 0; i < 9; i++) {
            t.insert(arr[i]);
            System.out.println();
            t.inorderTraversal();
        }
        t.printTree();
    }

}
