public class DeleteANode {
    public static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static Node Delete(Node root, int val) {
        if (root == null) {
            return null;
        }
        if (root.data < val) {
            root.right = Delete(root.right, val);
        }
        if (root.data > val) {
            root.left = Delete(root.left, val);
        }
        // LEAF NODE
        if (root.left == null && root.right == null) {
            return null;
        }
        // ONE CHILD
        if (root.left == null) {
            return root.right;
        } else if (root.right == null) {
            return root.left;
        }

        // TWO CHILDREN - INORDER SUCCESSOR

        // STEP-1
        // FIND IS
        Node IS = findInorderSuccessor(root.right);

        // STEP-2
        // REPLACE IS WITH THE NODE THAT NEED TO BE DELETED
        root.data = IS.data;

        // STEP-3
        // DELETE THE NODE
        root.right = Delete(root.right, val);

        return root;
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;

        }
        if (root.data < val) {
            root.right = insert(root.right, val);
        } else if (root.data > val) {
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

    public static void main(String[] args) {
        int values[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();
        root= Delete(root, 1);
        inorder(root);
    }
}
