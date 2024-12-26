public class sumofsubarrays {
    public static void Sum_Of_SubArrays(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += arr[k];
                    if (maxSum < currSum) {
                        maxSum = currSum;
                    }
                }
                System.out.println(currSum);

            }
        }
        System.out.println("Maximumx sum=" + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = { -2, 43, 21, -8, 10 };
        Sum_Of_SubArrays(arr);
    }
}
