
public class removeFirst {
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
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void removeFirst() {
        head = head.next;
    }

    public static void main(String[] args) {
      Linkedlist ll=new Linkedlist();
      ll.addFirst(1);
      ll.addFirst(2);
      ll.addFirst(3);
      ll.addFirst(4);
      ll.addFirst(5);
      ll.print();
      ll.removeFirst();
      ll.print();

    }
}
