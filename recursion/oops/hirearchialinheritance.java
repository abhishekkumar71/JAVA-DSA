public class hirearchialinheritance {
    public static void main(String[] args) {
        Mammal dog = new Mammal();
        dog.color = "Black";
        Bird eagle = new Bird();
        eagle.eat();
        Fish shark = new Fish();
        shark.breath();
        System.out.println(dog.color);
    }
}

class Animal {
    String color;

    void eat() {
        System.out.println("Eats..");
    }

    void breath() {
        System.out.println("Breathes..");
    }
}

class Mammal extends Animal {
    void walks() {
        System.out.println("Walks..");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("Flies..");
    }
}

class Fish extends Animal {
    void swims() {
        System.out.println("Swims..");
    }
}