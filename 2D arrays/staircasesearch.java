public class staircasesearch {
    public static boolean staircasesearchsortedmatrix(int n[][], int key) {
        int row = 0;
        int col = n[0].length - 1;
        while (row < n.length && col >= 0) {
            if (n[row][col] == key) {
                System.out.println("key found at" + "(" + row + "," + col + ")");
                return true;
            } else if (key < n[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("key not found");

        return false;
    }

    public static void main(String[] args) {
        int n[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };
        int key = 33;
        staircasesearchsortedmatrix(n, key);
    }
}
