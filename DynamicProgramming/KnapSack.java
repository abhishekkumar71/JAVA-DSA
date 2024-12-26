
public class KnapSack {
    // 0-1 KNAAPSACK
    public static int knapsack(int val[], int wt[], int W, int idx) {
        if (W == 0 || idx == val.length ) {
            return 0;
        }
        if (wt[idx ] <= W) {
            // INCLUDE
            int ans1 = val[idx ] + knapsack(val, wt, W - wt[idx ], idx + 1);
            // exclude
            int ans2 = knapsack(val, wt, W, idx + 1);
            return Math.max(ans1, ans2);
        } else {
            return knapsack(val, wt, W, idx + 1);
        }
    }

    public static void main(String[] args) {
        int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int w = 7;
        System.out.println("The maximum profit of Knapsack: " + knapsack(val, wt, w, 0));
    }
}
