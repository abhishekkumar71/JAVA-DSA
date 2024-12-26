public class methods {

    static int logic(int x, int y) { // Method or function declaration
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        return z;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c = logic(a, b); // method call or function call
        int d = 2;
        int e = 1;
        int f = logic(d, e);// method call or function call
        System.out.println(c);
        System.out.println(f);

    }
}