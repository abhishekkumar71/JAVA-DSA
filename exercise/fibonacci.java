import java.util.*;
public class fibonacci {
    static void fibonacci(int a ,int b,int n){
        int temp;
        System.out.print(a+" ");
        for(int i=0;i<=n;i++){
            temp=b;
            b=a+b;
            a=temp;
            System.out.print(b+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
     int n=sc.nextInt();
     int a=0;
     int b=1;
    fibonacci(a, b, n);
    }
}
