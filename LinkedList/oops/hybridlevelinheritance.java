public class hybridlevelinheritance {
    public static void main(String[] args) {
        Mammal human = new Mammal();
        human.legs = 2;
        System.out.println(human.legs);
        human.breath();
        ;
        Bird eagle = new Bird();
        eagle.wings = 2;
        System.out.println(eagle.wings);
        eagle.eat();
        Fish shark = new Fish();
        shark.eat();
        shark.fins = 3;
        System.out.println(shark.fins);
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
    int legs;

    void walks() {
        System.out.println("Walks...");
    }
}

class Bird extends Animal {
    int wings;

    void fly() {
        System.out.println("Flies..");
    }
}

class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("Swims..");
    }
}
