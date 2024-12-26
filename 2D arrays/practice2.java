//sum of 2nd row

public class practice2 {
    public static void sum(int n[][]) {
        int sum = 0;
        for (int i = 1; i == 1; i++) {
            for (int j = 0; j <= n.length - 1; j++) {
                sum += n[i][j];
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int n[][] = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        sum(n);
    }
}
