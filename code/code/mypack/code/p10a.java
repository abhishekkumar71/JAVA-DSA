package code;
import java.util.*;

public class p10a {
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        
        
        int evensum=0;
        int choice;
        int oddsum=0;
        do{
             System.out.println("Enter n:");
 int n=sc.nextInt();
            if(n%2==0){
evensum+=n;
            }
            else{
                oddsum+=n;
            }
            System.out.println("enter choice(0 to exit and 1 to continue)");
             choice=sc.nextInt();
        }while(choice==1);
        
        System.out.println(evensum);
        System.out.println(oddsum);
    }
}
