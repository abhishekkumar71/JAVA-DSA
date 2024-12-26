public class transpose {
    public static void transpose(int n[][], int row, int col) {
        int transpose[][] = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = n[i][j];
            }
        }
        print(transpose);

    }

    public static void print(int n[][]) {
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[0].length; j++) {
                System.out.print(n[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
        int row = 2, col = 3;
        print(n);
        transpose(n, row, col);
    }
}
