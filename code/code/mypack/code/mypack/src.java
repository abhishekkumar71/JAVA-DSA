package code.mypack;

import java.util.Scanner;

public class src {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string:");
        String s=scan.nextLine();

System.out.println("ENTer int:");
        int i = scan.nextInt();
System.err.println("Enter double:");
        double d=scan.nextDouble();
        
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
    }

