//LCM
import java.util.*;
public class lcm {
    static void lcm(int n1,int n2){
        int lcm;
        if(n1>n2){
lcm=n1;
        }
        else{
            lcm=n2;
        }
        while (true) {
            if(lcm%n1==0 && lcm%n2==0){
                System.out.println("LCM of two numbers is:" +lcm);
                break;
            }
            lcm++;
        }
    }
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter n1:");
    int n1=sc.nextInt();
    System.out.println("Enter n2:");
    int n2=sc.nextInt();
lcm(n1, n2);
   } 
}
