import java.util.*;

public class MergeKsortedLL {
    static class Node implements Comparable<Node> {
        int data;
        Node next;

        Node(int key) {
            this.data = key;
            next = null;
        }

        @Override
        public int compareTo(Node n2) {
            return this.data - n2.data;
        }
    }

    static Node merge(Node arr[], int k) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        Node head = new Node(0);
        Node last = head;
        // PUSH THE HEAD NODES OF ALL LINKEDLISTS TO PQ
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                pq.add(arr[i]);
            }
        }

        if (pq.isEmpty()) {
            return null;
        }
        // TILL Pq is not empty
        while (!pq.isEmpty()) {
            Node curr = pq.poll();

            // ADD THE TOP ELEMENT OF QUEUE TO THE RESULTANT MERGED LIST
            last.next = curr;
            last = last.next;

            // CHECK IF THERE IS A NODE NEXT TO THE TOP NODE IN THE LIST OF WHICH TOP NODE
            // IS A MEMBER
            if (curr.next != null) {
                // PUSH THE NEXT NODE OF TOP NODE INTO pq
                pq.add(curr.next);
            }
        }
        return head.next;
    }

    public static void PrintLL(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        int n = 3, k = 3;
        // ARRAY TO STORE HEAD OF LL
        Node a[] = new Node[k];
        // LL1
        Node head1 = new Node(1);
        a[0] = head1;
        head1.next = new Node(3);
        head1.next.next = new Node(7);

        // LL2
        Node head2 = new Node(2);
        a[1] = head2;
        head2.next = new Node(4);
        head2.next.next = new Node(8);

        // LL3
        Node head3 = new Node(9);
        a[2] = head3;
        head3.next = new Node(10);
        head3.next.next = new Node(11);

        Node ans = merge(a, k);
        if (ans != null) {
            PrintLL(ans);
        }

    }
}
