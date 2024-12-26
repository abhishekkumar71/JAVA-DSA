public class multilevelinheritance {
    public static void main(String[] args) {
        Dog boomer = new Dog();
        boomer.eat();
        boomer.legs = 4;
        System.out.println(boomer.legs);
    }
}

// BASE CLASS
class Animal {
    String color;

    void breath() {
        System.out.println("Breathes");
    }

    void eat() {
        System.out.println("Eats");
    }
}

// DERIVED CLASS
class Mammal extends Animal {
    int legs;
}

class Dog extends Mammal {
    String breed;
}