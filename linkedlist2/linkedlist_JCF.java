
//CREATION OF LINKED LIST USING JAVA COLLECTION FRAMEWORK
import java.util.*;

public class linkedlist_JCF {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        // 0-> 1-> 2
        System.out.println(ll);
        // REMOVE
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}
