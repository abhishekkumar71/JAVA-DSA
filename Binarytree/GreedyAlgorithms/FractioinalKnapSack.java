import java.util.*;

public class FractioinalKnapSack {
    public static void main(String[] args) {
        int weight[] = { 10, 20, 30 };
        int value[] = { 60, 100, 120 };
        int W = 50;
        double ratio[][] = new double[value.length][2];
        // 0th=>index
        // 1th => ratio
        for (int i = 0; i < value.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = value[i] / (double) weight[i];
        }
        // ASCENDING ORDER
        Arrays.sort(ratio, Comparator.comparing(o -> o[1]));
        int capacity = W;
        int finalVal = 0;
        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (capacity >= weight[idx]) {
                finalVal += value[idx];
                capacity -= weight[idx];
            } else {
                // INCLUDE FRACTIONAL ITEM
                finalVal += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        System.out.println(finalVal);
    }
}
