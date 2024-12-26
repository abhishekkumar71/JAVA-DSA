import java.util.*;
// FINDING THE NO.OF POSITIVE,NEGATIVE,ZERO'S ENTERED
public class findingpsns0 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int zero = 0, positive = 0, negative = 0;
      System.out.println("Enter 1 to continue and 0 to stop");

      int input = sc.nextInt();

      while (input == 1) {
         System.out.println("enter number");
         int number = sc.nextInt();
         if (number > 0) {
            positive++;
         } else if (number < 0) {
            negative++;
         } else {
            zero++;
         }
         System.out.println("Enter 1 to continue and 0 to stop");

         input = sc.nextInt();
      }
      System.out.println("no.of positive numbers:" + positive);
      System.out.println("no.of negative numbers:" + negative);
      System.out.println("no.of zero's:" + zero);

   }
}
