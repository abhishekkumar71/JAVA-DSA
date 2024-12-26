public class sum_of_n {
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        int sm1 = sum(n - 1);
        int sm = n + sm1;
        return sm;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(sum(n));
    }
}
