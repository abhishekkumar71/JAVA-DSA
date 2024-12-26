package code;

public class p3 {
    public static void main(String[] args) {
        float pencil=3.456f;
        float eraser=2.135f;
        float sharpener=2.235f;
        float sum= pencil+eraser+sharpener;
        System.out.println(sum);
        float cost= sum+(float)(0.18*sum);
        System.out.println(cost);
    }
}
