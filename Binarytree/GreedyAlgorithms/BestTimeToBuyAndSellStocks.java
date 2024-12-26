import java.util.*;

public class BestTimeToBuyAndSellStocks {
    public static void bestTime(int price[], int n) {
        int curr = price[0];
        int max_profit = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            if (price[i] < curr) {
                curr = price[i];
            }
            int curr_profit = price[i] - curr;
          if (curr_profit > max_profit) {
                max_profit = curr_profit;
            }

        }
        System.out.println("The maximum profit:" + max_profit);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println("Enter array elements:");
        int price[] = new int[n];
        for (int i = 0; i < price.length; i++) {
            price[i] = sc.nextInt();
        }

        bestTime(price, n);
    }
}
