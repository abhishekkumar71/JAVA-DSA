package patterns;
import java.util.*;
public class p15 {
    public static void main(String[] args) {
        char ch='A';
        System.out.println("enter n:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(ch);
            ch++;
        }
        System.out.println();
       }
    }
}
