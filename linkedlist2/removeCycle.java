public class removeCycle {
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

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
        }
    }

    public static boolean isLoop() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;// +1
            fast = fast.next.next;// +2
            if (slow == fast) {
                return true; // CYCLE OR EXISTS
            }
        }
        return false;// CYCLE OR LOOP DOESNOT EXIST
    }

    public static void remove() {
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while (fast != null & fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return;
        }

        // FIND MEETING POINT
        slow = head;
        Node prev = null;// LAST NODE
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        // REMOVE CYCLE
        prev.next = null;
    }

    public static void main(String[] args) {
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        System.out.println(isLoop());
        remove();
        System.out.println(isLoop());

    }

}
