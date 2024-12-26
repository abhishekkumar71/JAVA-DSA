public class superkeyword {
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.color);
    }
}

class Animal {
    String color;
}

class Horse extends Animal {
    Horse() {
        super.color = "Brown";
        System.out.println("Horse constructor is called");
    }
}