public class binarytodecimal {
    public static void decimalnum(int n) {
        int binNum = n;
        int decNum = 0;
        int ld;
        for (int pow = 0; n > 0; pow++) {
            ld = n % 10;
            decNum = decNum + (ld * (int) Math.pow(2, pow));
            n = n / 10;
        }
        System.out.println("decimal of " + binNum + "=" + decNum);
    }

    public static void main(String[] args) {
        decimalnum(11111);
    }
}
