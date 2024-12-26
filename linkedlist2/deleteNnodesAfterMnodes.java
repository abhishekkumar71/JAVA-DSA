public class deleteNnodesAfterMnodes {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node tail;
    public static Node head;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void keepAndDelete(int m, int n) {
        Node temp = head;
        while (temp != null) {
            for (int i = 1; i < m && temp != null; i++) {
                temp = temp.next;
            }
            if (temp == null) {
                return;
            }
            Node nextNode = temp.next;
            for (int i = 0; i < n && nextNode != null; i++) {
                nextNode = nextNode.next;
            }
            temp.next = nextNode;
            temp = nextNode;
        }
    }

    public static void main(String[] args) {
        deleteNnodesAfterMnodes ll = new deleteNnodesAfterMnodes();
        ll.addFirst(8);
        ll.addFirst(7);
        ll.addFirst(6);
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        ll.keepAndDelete(2, 2);
        ll.print();

    }
}
