import java.util.*;

public class TrappingWater {
    public static int maxWater(int arr[]) {
        int ans = 0;
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] < arr[i]) {
                int pop_height = arr[s.peek()];
                s.pop();
                if (s.isEmpty()){
                    break;
                }
                int distance = i - s.peek() - 1;
                int min_height = Math.min(arr[s.peek()], arr[i]) - pop_height;
                ans += distance * min_height;
            }
            s.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 0, 4, 2, 5, 0, 6, 4, 0, 5 };
        System.out.println(maxWater(arr));
    }
}
