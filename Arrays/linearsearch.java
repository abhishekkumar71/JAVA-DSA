public class linearsearch {
    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]== key) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 5, 71, 69, 97 };
        int key = 69;
        int index = linearSearch(numbers, key);
        if (index == -1) {
            System.out.println("number not found");
        } else {
            System.out.println("number found at index position:" + index);
        }
    }
}