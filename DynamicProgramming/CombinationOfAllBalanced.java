
/**
 * CombinationOfAllBalanced
 */
import java.util.*;

public class CombinationOfAllBalanced {
    public static void Combination(char str[],int n, int open, int closed,int pos) {
      if (closed==n) {
        for(int i=0;i<str.length;i++){
            System.out.print(str[i]+" ");
        }
System.out.println();      }
        if (open < n) {
            str[pos]='{';
            Combination(str,n, open + 1, closed,pos+1);
        }
        if (closed < open) {
          str[pos]='}';    
         Combination(str,n , open, closed + 1,pos+1);
        }
        

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
       
        char str[] = new char[2 * n];
        Combination(str, n,0,0,0);
    }
}