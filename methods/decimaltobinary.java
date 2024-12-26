public class decimaltobinary {
    public static void binary(int n) {
        int binNum = 0;
        int decNum = n;
        int rem;
        for (int pow = 0; n > 0; pow++) {
            rem = n % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            n = n / 2;

        }
        System.out.println("Binary of " + decNum + "=" + binNum);
    }

    public static void main(String[] args) {
        binary(7);
    }
}
