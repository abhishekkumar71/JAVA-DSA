
//METHOD OVERRIDING
public class runtime {
    public static void main(String[] args) {
        Deer dc = new Deer();
        dc.eat();
    }
}

class Animal {
    void eat() {
        System.out.println("Eats..");
    }
}

class Deer {
    void eat() {
        System.out.println("Eats grass..");
    }
}
