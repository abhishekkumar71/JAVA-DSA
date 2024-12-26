public class KnightPaths {
    public static void path(int board[][], int i, int j, int movenumber, int n) {

        if (i < 0 || j < 0 || i >= n || j >= n) {
            return;
        }
        if (board[i][j] != 0) {
            return;
        }
        board[i][j] = movenumber;

        if (movenumber == n * n - 1) {
            for (int x = 0; x < board.length; x++) {
                for (int y = 0; y < board.length; y++) {
                    System.out.print(board[x][y] + " ");
                }
                System.out.println();
            }
            return;
        }

        path(board, i - 2, j + 1, movenumber + 1, n);

        path(board, i - 1, j + 2, movenumber + 1, n);

        path(board, i + 1, j + 2, movenumber + 1, n);
        path(board, i + 2, j + 1, movenumber + 1, n);

        path(board, i + 2, j - 1, movenumber + 1, n);

        path(board, i + 1, j - 2, movenumber + 1, n);

        path(board, i - 1, j - 2, movenumber + 1, n);

        path(board, i - 2, j - 1, movenumber + 1, n);

        board[i][j] = 0;

    }

    public static void main(String[] args) {
        int n = 8;
        int board[][] = new int[n][n];

        path(board, 0, 0, 0, n);
    }
}
