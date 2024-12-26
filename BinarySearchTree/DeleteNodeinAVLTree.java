public class DeleteNodeinAVLTree {
    public static class Node {
        int data, height;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.height = 1;
        }
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        return root.height;
    }

    public static Node root;

    public static int getBalance(Node root) {
        if (root == null) {
            return 0;
        }
        return height(root.left) - height(root.right);
    }

    public static Node getMinNode(Node root) {
        Node curr = root;
        // MIN DATA IS AT LEFTMOST TREE
        while (curr.left != null) {
            curr = curr.left;
        }
        return curr;
    }

    public static Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // ROTATION
        x.right = y;
        y.left = T2;

        // UPDATE HEIGHTS
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return x; // NEW ROOT

    }

    public static Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        // ROTATION
        y.left = x;
        x.right = T2;

        // UPDATE HEIGHTS
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    public static Node DeleteNode(Node root, int key) {

        // PERFORM USUAL BST DELETE
        if (root == null) {
            return root;
        }

        // KEY<ROOT.DATA - KEY LIES IN LEFT SUBTREE
        if (key < root.data) {
            root.left = DeleteNode(root.left, key);
        } else if (key > root.data) {
            root.right = DeleteNode(root.right, key);
        }

        else {
            // KEY=ROOT.DATA - THIS IS THE NODE TO BE DELETED

            // NODE WITH ONLY ONE CHILD OR NO CHILD
            if (root.left == null || root.right == null) {
                Node temp = null;

                if (temp == root.left) {
                    temp = root.right;
                } else {
                    temp = root.left;
                }
                // NO CHILD
                if (temp == null) {
                    temp = root;
                    root = null;
                } else {
                    root = temp;// COPY THE CONTENT OF NON-EMPTY CHILD
                }
            } else {
                // NODE WITH 2 CHILDREN
                // GET THE INORDER SUCCESSOR(SMALLEST IN THE RIGHT SUBTREE)
                Node temp = getMinNode(root.right);

                // COPY THE INORDER SUCCESSORS'S DATA TO THIS NODE
                root.data = temp.data;

                // DELETE THE INORDER SUCCESSOR
                root.right = DeleteNode(root.right, temp.data);
            }
        }

        // IF TREE HAD ONLY 1 NODE RETURN
        if (root == null) {
            return root;
        }
        // UPDATE HEIGHT OF CURR NODE
        root.height = Math.max(height(root.left), height(root.right)) + 1;

        // GET BALANCED FACTOR OF THIS NODE (TO CHECK FOR UNBALANCED)
        int bf = getBalance(root);
        // IF NODE BECOMES UNBALANCED

        // LL CASE
        if (bf > 1 && getBalance(root.left) >= 0) {
            return rightRotate(root);
        }
        // LR CASE
        if (bf > 1 && getBalance(root.left)<0) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }
        // RR CASE
        if (bf < -1 && getBalance(root.right)<=0) {
            return leftRotate(root);
        }

        // RL CASE
        if (bf < -1 && getBalance(root.right)>0) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }
        return root;
    }
    public static Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }
        if (key < root.data) {
            root.left = insert(root.left, key);
        } else if (key > root.data) {
            root.right = insert(root.right, key);
        } else {
            return root;// no duplicates
        }

        // UPDATE ROOT'S HEIGHT
        root.height =Math.max(height(root.left), height(root.right)) + 1;

        // GET BALANCE FACTOR
        int bf = getBalance(root);

        // LL CASE
        if (bf > 1 && key < root.left.data) {
            return rightRotate(root);
        }

        // RR CASE
        if (bf < -1 && key > root.right.data) {
            return leftRotate(root);
        }

        // LR CASE
        if (bf > 1 && key > root.left.data) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }
        // RL CASE
        if (bf < -1 && key < root.right.data) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }
        return root;
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 30);
        root = insert(root, 40);
        root = insert(root, 50);
        root = insert(root, 25);
        root = insert(root, 35);
        root = insert(root, 37);
        root = insert(root, 36);
        root = insert(root, 32);


       
        preorder(root);
        DeleteNode(root, 32);
        System.out.println();
        preorder(root);
    }
}


