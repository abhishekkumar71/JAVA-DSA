public class methodoverloading {
    static void display() {
        System.out.println("Hellooo");
    }

    static void display(int a) {
        System.out.println("Good Morning" + a);
    }

    static void display(int a, int b) {
        System.out.println("Helloo" + a);
        System.out.println("Good Morning" + b);
    }

    public static void main(String[] args) {
        display();
        display(5);
        display(5, 7);
    }
}
