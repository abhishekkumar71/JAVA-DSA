//FINDING ELEMENT IN A 2D ARRAY
public class practice5 {
    public static void main(String[] args) {
        int[][] a = { { 14, 5, 7 }, { 19, 31, 69 }, { 7, 90, 11 } };
        int n = 69;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (a[i][j] == n) {

                    System.out.println("element found at index:(" + i + "," + j + ")");
                }
            }
        }
    }
}
