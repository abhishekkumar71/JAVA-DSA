/**
 * abstraction
 */
public class abstraction {

    public static void main(String[] args) {
        dog d= new dog();
        chicken c=new chicken();
        d.eat();
        d.walks();
        c.eat();
        c.walks();
    }
}
 abstract class Animal{

    void eat(){
        System.out.println("eats..");

    }
    abstract void walks();
}
class dog extends Animal{
    void walks(){
        System.out.println("Walks on 4 legs");
    }
}
class chicken extends Animal{
    void walks(){
        System.out.println("Walks on 2 legs");
    }
}