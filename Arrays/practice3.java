//ADDING TWO MATRICES
public class practice3 {
    public static void main(String[] args) {
        int[][] a = { { 0, 1, 8 }, { 1, 2, 6 } };
        int[][] b = { { 2, 1, 34 }, { 3, 4, 14 } };
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + b[i][j] + " ");

            }
            System.out.println();
        }
    }
}
