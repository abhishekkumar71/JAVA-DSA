/**
 * complexcalculation
 */
public class complexcalculation {

    public static void main(String[] args) {
        complex c = new complex(3, 5);
        complex d = new complex(4, 5);
        complex e = complex.add(c, d);
        complex f = complex.sub(c, d);
        complex g = complex.mul(c, d);
        e.print();
        f.print();
        g.print();
    }
}

class complex {
    int real;
    int imag;

    public complex(int r, int i) {
        real = r;
        imag = i;
    }

    public static complex add(complex a, complex b) {
        return new complex((a.real + b.real), (a.imag + b.imag));
    }

    public static complex sub(complex a, complex b) {
        return new complex((a.real - b.real), (a.imag - b.imag));
    }

    public static complex mul(complex a, complex b) {
        return new complex((a.real * b.real) - (a.imag * b.imag), (a.real * b.imag) + (a.imag * b.real));
    }

    public void print() {
        System.out.println(real + "+" + imag + "i");
    }
}
