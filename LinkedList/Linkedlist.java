/**
 * Linkedlist
 */
public class Linkedlist {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;
    public int size;

    public void addFirst(int data) {

        // step-1
        // CREATE NEW NODE
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step-2
        // newnode next=head
        newNode.next = head;

        // step-3
        // head=newNode
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();

    }

    public void add(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        // i=index-1;
        // temp->prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("Linked list is empty");
            return Integer.MAX_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("Linked List is empty");
            return Integer.MAX_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        // previous node -> i=size-2
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data; // tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int recSearch(Node head, int key) {
Node temp=head;
        if (head == null) {
            return -1;
        } 
        else if (temp.data == key)

        {
            return 0;
        }
        int idx = recSearch(head.next, key);
        return idx + 1;
    }

    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;
        while (fast!=null && fast.next!=null) {
         slow=slow.next;
         fast=fast.next.next;
        }
        return slow;
     }
     public boolean checkPalindrome(){
         if (head==null || head.next!=null) {
             // FIND MID
             Node midNode=findMid(head);
 
             //REVERSE THE 2ND HALF
             Node prev=null;
             Node curr=midNode;
             Node next;
             while (curr!=null) {
                 next=curr.next;
                 curr.next=prev;
                 prev=curr;
                 curr=next;
             }
             Node right=prev;
             Node left=head;
             while (right!=null) {
                 if (left.data!=right.data) {
                     return false;
                 }
                 left=left.next;
                 right=right.next;
             }
         }
         return true;
 
     }
 


    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.print();
        System.out.println("element found at:" + ll.itrSearch(4));
        System.out.println("Element found at index:" + ll.recSearch(head, 4));

        ll.add(2, 9);
        ll.print();
        System.out.println("Size of linked list:" + ll.size);
        ll.removeFirst();
        ll.print();
        System.out.println("size of linked list after removal:" + ll.size);
        ll.removeLast();
        ll.print();
        System.out.println("size of linked list after removal:" + ll.size);
        ll.reverse();
        ll.print();
        System.out.println(ll.checkPalindrome());
    }

    
    
   
   
}