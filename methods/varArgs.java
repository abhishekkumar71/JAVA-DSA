public class varArgs {
    static int sum(int... arr) {
        int sum = 0;
        for (int a : arr) {
            sum += a;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum:" + sum());
        System.out.println("Sum:" + sum(1));
        System.out.println("Sum:" + sum(5, 9));
        System.out.println("Sum:" + sum(10, 13, 15));
        System.out.println("sum:" + sum(51, 17, 19, 95));
        System.out.println("sum:" + sum(121, 34, 56, 67, 78, 90));

    }
}
