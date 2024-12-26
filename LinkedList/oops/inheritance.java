public class inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
    }
}

//SINGLE LEVEL INHERITANCEE
// BASE CLASS
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breath() {
        System.out.println("Breathes");
    }
}

// DERIVED CLASS
class Fish extends Animal {
    int fins;

    void swims() {
        System.out.println("swims");
    }
}
