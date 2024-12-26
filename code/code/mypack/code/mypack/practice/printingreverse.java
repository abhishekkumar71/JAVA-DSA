package code.mypack.practice;
import java.util.*;
public class printingreverse {
    public static void main(String[] args) {
        System.out.println("enter n:");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        while (n>0) {
            int lastdigit=n%10;
            System.out.print(lastdigit);
            n=n/10;
        }
        }
    }

