public class palindrome {
    public static void palindrome(int n) {
        int rev = 0;
        int myNum = n;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        System.out.println(rev);
        if (myNum == rev) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
    }

    public static void main(String[] args) {
        palindrome(121);
    }
}
