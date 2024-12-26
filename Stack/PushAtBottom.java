import java.util.*;

public class PushAtBottom {
    public static boolean isEmpty(Stack<Integer> s) {
        return s.size() == 0;
    }

    public static void PushAtBottom(Stack<Integer> s, int data) {
        if (isEmpty(s)) {
            s.push(data);
            return;
        }
        int top = s.pop();
        PushAtBottom(s, data);
        s.push(top);

    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        PushAtBottom(s, 4);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

}
