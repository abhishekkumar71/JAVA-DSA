import java.util.*;

public class MaxProfitAfterBuyingAndSellingStocks {
    public static void findMaxProfit(int arr[], int n, int TranFee) {
        int minPrice = arr[0];
        int buyDay = 0, sellDay = 0;
        int TotalProfit = 0;
        int dayDiff = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] < minPrice) {
                minPrice = arr[i];
                buyDay = i;
            }
            int profit = arr[i] - minPrice - TranFee;
            if (profit > 0) {
                sellDay = i;
                TotalProfit += profit;
                minPrice = arr[i] - TranFee;
                dayDiff = sellDay - buyDay;
            }
        }
        System.out.println("The MAX profit:" + TotalProfit);
        System.out.println("The day difference:" + dayDiff);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println("Enter array:");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter fee:");
        int TranFee = sc.nextInt();
        findMaxProfit(arr, n, TranFee);
    }
}
