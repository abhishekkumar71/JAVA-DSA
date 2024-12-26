public class diagonalsum2 {
    public static void diagonalsum(int n[][]) {
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum += n[i][i];
            if (i != n.length - 1 - i) {
                sum += n[i][n.length - 1 - i];
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int n[][] = { { 1, 2, 3 }, { 5, 6, 7 }, { 8, 9, 10 } };
        diagonalsum(n);
    }
}
