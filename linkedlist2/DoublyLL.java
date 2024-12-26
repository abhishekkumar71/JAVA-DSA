public class DoublyLL {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

    }

    public static Node tail;
    public static Node head;

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;

        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    public void addInTheMiddle(int index,int data){
        Node newNode=new Node(data);
        Node temp=head;
      for(int i=0;i<index-1;i++){
        temp=temp.next;
        temp.prev=temp;
      }
      temp.next=newNode.next;
      temp.next=newNode;

    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void removeFirst() {
        if (head == null) {
            return;

        } else if (head == tail) {
            tail = head = null;
            return;
        }
        head = head.next;
        head.prev = null;

    }

    public void removeLast() {
        if (tail == null) {
            return;
        } else if (tail == head) {
            head = tail = null;
            return;
        }
        tail = tail.prev;
        tail.next = null;
    }

    public static void main(String[] args) {
        DoublyLL ll = new DoublyLL();
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.removeFirst();
        ll.removeLast();
        ll.addInTheMiddle(2, 6);

        ll.print();

    }
}
