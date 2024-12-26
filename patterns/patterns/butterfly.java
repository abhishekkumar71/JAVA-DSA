package patterns;

//BUTTERFLY
public class butterfly {
    public static void main(String[] ags) {
        int n = 4;
        // 1ST HALF
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            int sp = 2 * (n - i);
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 2ND HALF
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            int sp = 2 * (n - i);
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}