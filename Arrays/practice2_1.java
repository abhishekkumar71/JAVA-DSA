//SUM OF FLOATS
public class practice2_1 {
    public static void main(String[] args) {
        float[] n = { 12.3f, 56.7f, 43.6f, 78.9f, 33.7f };
        float sum = 0;
        for (float element : n) {
            sum += element;
        }
        System.out.println("sum of elelments:" + sum);
    }
}
