
/**
 * BoxStacking
 */
import java.util.*;

public class BoxStacking {
     public static int maxHeight(int[][] cuboids){
        int n = cuboids.length;
        for (int i = 0; i < n; i++) {
            Arrays.sort(cuboids[i]);
        }
        
        Arrays.sort(cuboids, (a, b) -> {
            if (a[0] != b[0])
                return Integer.compare(a[0], b[0]);
            if (a[1] != b[1])
                return Integer.compare(a[1], b[1]);
            return Integer.compare(a[2], b[2]);
        });
        
        int dp[] = new int[n];
        dp[0] = cuboids[0][2];
        for (int i = 1; i < n; i++) {
            dp[i] = cuboids[i][2];
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (cuboids[i][0] >= cuboids[j][0] && cuboids[i][1] >= cuboids[j][1]
                        && cuboids[i][2] >= cuboids[j][2]) {
                    dp[i] = Math.max(dp[i], dp[j] + cuboids[i][2]);
                }
            }}
            int maxLen=0;
            for(int i=0;i<n;i++){
                maxLen=Math.max(maxLen, dp[i]);
            }
            return maxLen;
        }
    public static void main(String[] args) {
        int cuboids[][] = { { 50, 45, 20 }, { 37, 95, 53 }, { 45, 23, 12 } };
       System.out.println(maxHeight(cuboids));
    }
}