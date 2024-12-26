import java.util.*;

public class MinimumOperationsToHalfTheArraySum {
    public static int findSum(int arr[]) {
        int sum = 0;
        PriorityQueue<Double> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            pq.add((double) arr[i]);
        }
        double target = sum / 2;
        int count = 0;
        int currsum = sum;

        while (currsum > target) {
            double large = pq.remove();
            currsum -= large; // Subtract the divided value from the sum
            pq.add(large / 2);
            currsum += large / 2;
            count++; // Increment the operation count
        }
        return count;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int minOperations = findSum(arr);
        System.out.println("Minimum operations: " + minOperations);
    }
}
