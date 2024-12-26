import java.util.*;

public class NextGreater {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        int arr[] = { 6, 8, 0, 1, 3 };
        int nextGreat[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nextGreat[i] = -1;
            } else {
                nextGreat[i] = arr[s.peek()];
            }
            s.push(i);
        }

        for (int i = 0; i < nextGreat.length; i++) {
            System.out.print(nextGreat[i] + " ");
        }
        System.out.println();
    }
}