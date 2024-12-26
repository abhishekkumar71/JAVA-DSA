//PRINTING NUMBERS IN INCREASING ORDER FROM 1 TO N 

public class example2 {
    public static void printinc(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        printinc(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        int n = 10;
        printinc(n);
    }
}
