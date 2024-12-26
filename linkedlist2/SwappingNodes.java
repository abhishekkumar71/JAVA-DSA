public class SwappingNodes {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

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

    public void swap(int x, int y) {
        if (x == y) {
            return;
        }
        Node tempX = head;
        Node prevX = null;
        while (tempX != null && tempX.data != x) {
            prevX = tempX;
            tempX = tempX.next;
        }
        Node tempY = head;
        Node prevY = null;
        while (tempY != null && tempY.data != y) {
            prevY = tempY;
            tempY = tempY.next;
        }
        if (tempX == null || tempY == null) {
            return;
        }
        if (prevX != null) {
            prevX.next = tempY;

        } else {
            head = tempY;

        }

        if (prevY != null) {
            prevY.next = tempX;

        } else {

            head = tempX;
        }
        Node curr = tempX.next;
        tempX.next = tempY.next;
        tempY.next = curr;
    }

    public static void main(String[] args) {
        SwappingNodes ll = new SwappingNodes();
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        ll.swap(2, 4);
        ll.print();

    }
}