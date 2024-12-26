import java.util.*;

public class ReversingTheFirstKelements {
    public static void ReverseK(Queue<Integer> q, int k) {
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < k; i++) {
            s.push(q.poll());
        }
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
        int size = q.size();

        for (int i = 0; i < size - k; i++) {
            q.add(q.poll());
        }
        for (int i = 0; i < size; i++) {
            q.add(q.poll());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        System.out.println("Enter K:");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        ReverseK(q, k);
        System.out.println(q);

    }
}
