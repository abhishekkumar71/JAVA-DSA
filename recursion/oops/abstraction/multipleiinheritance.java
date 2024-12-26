public class multipleiinheritance {
    public static void main(String[] args) {
        bear b = new bear();
        b.eats();
    }
}

interface herbivore {
    public void eats();
}

interface carnivore {
    public void eats();
}

class bear implements herbivore, carnivore {
    public void eats() {
        System.out.println("eats grass and flesh");
    }
}