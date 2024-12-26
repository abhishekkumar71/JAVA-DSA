import java.util.*;

//COUNT NUMBER OF BST'S THAT CAN BE FORMED 
public class CountingTrees {
    public static int NumberofBST(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            for (int j = 0; j < i; j++) {
                int leftsubTree = dp[j];
                int rightsubTree = dp[i - j - 1];
                dp[i] += leftsubTree * rightsubTree;
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println("No.of subtrees that can be formed: " + NumberofBST(n));
    }
}
