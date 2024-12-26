package code.mypack.practice;
import java.util.*;
public class p1{
public static void main(String[] args) {
    System.out.println("enter number");
    Scanner sc =new Scanner(System.in);
    int n= sc.nextInt();
    String result = n>0 ? "positive" : "negative";
    System.out.println(result);
}
}