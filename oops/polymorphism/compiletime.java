//METHOD OVERLOADING

public class compiletime {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.sum(2, 34));
        System.out.println(cal.sum(2.4, 5.67));
        System.out.println(cal.sum(12, 34, 71));
    }

}

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    double sum(double a, double b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}