import java.util.*;

public class PalindromeWithStacks {

    public static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static boolean isPalindrome() {
        Stack<Character> s = new Stack<>();
        Node temp = head;
        while (temp != null) {
            s.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            if (temp.data != s.pop()) {
                return false;
            }
            temp = temp.next;
        }
        return true;
    }

    public void add(char data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();

    }

    public static void main(String[] args) {
        PalindromeWithStacks list = new PalindromeWithStacks();
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('A');
        list.add('A');

        list.print();
        System.out.println(isPalindrome());
    }
}
