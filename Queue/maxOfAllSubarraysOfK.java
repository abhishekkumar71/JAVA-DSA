import java.util.*;

public class maxOfAllSubarraysOfK {
    static void PrintMAx(int arr[], int k, int n) {
        Deque<Integer> qi = new LinkedList<>();
        int i;
        for (i = 0; i < k; i++) {
            while ((!qi.isEmpty()) && arr[i] >= arr[qi.peekLast()]) {
                qi.removeLast();
            }
            qi.addLast(i);
        }
        for (; i < n; i++) {
            System.out.print(arr[qi.peek()] + " ");
            while (!qi.isEmpty() && qi.peek() <= i - k) {
                qi.removeFirst();
            }
            while (!qi.isEmpty() && arr[i] >= arr[qi.peekLast()]) {
                qi.removeLast();
            }
            qi.addLast(i);

        }
        System.out.println(arr[qi.peek()]);

    }

    public static void main(String[] args) {
        int arr[] = { 12, 1, 78, 90, 57, 89, 56 };
        int k = 3;
        PrintMAx(arr, k, arr.length);
    }
}
