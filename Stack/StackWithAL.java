import java.util.*;

/**
 * StackWithAL
 */
public class StackWithAL {

    static class stack {
        static ArrayList<Integer> list = new ArrayList<>();

       
        public boolean isEmpty() {
            return list.size() == 0;
        }

        // PUSH
        public void push(int data) {
            list.add(data);
        }

        // POP
        public void pop() {
            list.remove(list.size() - 1);
        }

        // PEEK
        public int peek() {
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }

}