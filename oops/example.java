public class example {
    public static void main(String[] args) {
       System.out.println(book.count);
       book b1=new book(150);
       book b2=new book(250);
     System.out.println(book.count);  
    }
}
class book{
    int price;
    static int count;

   
public  book(int price){
    this.price=price;
    count++;
   }}