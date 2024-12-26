public class SegregatingEvenAndoddLL {
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

    public void Segregate() {
        if (head == null) {
            return;
        }
        Node even = new Node(0);
        Node odd = new Node(0);
        Node evenTail = even;
        Node oddTail = odd;
        Node temp = head;
        while (temp != null) {
            if (temp.data % 2 == 0) {
                evenTail.next = temp;
                evenTail = evenTail.next;

            } else {
                oddTail.next = temp;
                oddTail = oddTail.next;
            }
            temp = temp.next;
        }
        evenTail.next = odd.next;
        oddTail.next = null;
        System.out.println(even.next);
    }

    public static void main(String[] args) {
        SegregatingEvenAndoddLL ll = new SegregatingEvenAndoddLL();
        ll.addFirst(6);
        ll.addFirst(1);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addFirst(10);
        ll.addFirst(12);
        ll.addFirst(8);
        ll.print();
        ll.Segregate();
        ll.print();

    }
}
