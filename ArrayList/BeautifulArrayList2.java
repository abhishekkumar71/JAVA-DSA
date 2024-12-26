
//DIVIDE AND CONQUER
import java.util.*;

public class BeautifulArrayList2 {
    public static void DivideAndConquer(int start, int increment, ArrayList<Integer> res, int n) {
        if (start + increment > n) {
            res.add(start);
            return;
        }
        DivideAndConquer(start, 2 * increment, res, n);
        DivideAndConquer(start + increment, 2 * increment, res, n);

    }
    private static ArrayList<Integer> BeautifulArrayList(int n){
       ArrayList<Integer>res=new ArrayList<>();
       DivideAndConquer(1, 1, res, n);
       return res;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        System.out.println("Enter n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
   System.out.println(BeautifulArrayList(n)); 
    }
}