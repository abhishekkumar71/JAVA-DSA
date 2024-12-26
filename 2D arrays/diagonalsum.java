public class diagonalsum {
    public static void diagonal(int n[][]) {
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length; j++) {
                if (i == j) {
                    sum += n[i][j];
                    ;
                } else if (i + j == n.length - 1) {
                    sum += n[i][j];
                }
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int n[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        diagonal(n);
    }
}
