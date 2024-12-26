public class maze {
    public static void Mazesolver(int maze[][], int i, int j, int sol[][], int n) {
        if (i < 0 || j < 0 || i >= n || j >= n || maze[i][j] == 0 || sol[i][j] == 1) {
            return;
        }

        if (i == n - 1 && j == n - 1) {
            sol[i][j] = 1;
            System.out.println("destination arrived");
            print(sol);
            return;
        }
        sol[i][j] = 1;
        Mazesolver(maze, i + 1, j, sol, n);
        Mazesolver(maze, i - 1, j, sol, n);
        Mazesolver(maze, i, j + 1, sol, n);
        Mazesolver(maze, i, j - 1, sol, n);
        sol[i][j] = 0;
    }

    public static void print(int sol[][]) {
        for (int i = 0; i < sol.length; i++) {
            for (int j = 0; j < sol.length; j++) {
                System.out.print(sol[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        int maze[][] = { { 1, 0, 0, 0 }, { 1, 1, 0, 1 }, { 0, 1, 0, 0 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 } };
        int sol[][] = new int[n][n];
        Mazesolver(maze, 0, 0, sol, n);
    }
}
