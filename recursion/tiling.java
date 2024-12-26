public class tiling {
    public static int filling(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fnm1 = filling(n - 1); // VERTICAL FILLING
        int fnm2 = filling(n - 2);// HORIZONTAL FILLING
        int total = fnm1 + fnm2;
        return total;
    }

    public static void main(String[] args) {
        System.out.println(filling(6));
    }
}
