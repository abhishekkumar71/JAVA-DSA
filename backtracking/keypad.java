public class keypad {
    final static char[][] L = { {}, {}, { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'i' }, { 'j', 'k', 'l' },
            { 'm', 'n', 'o' }, { 'p', 'q', 'r', 's' }, { 't', 'u', 'v' }, { 'w', 'x', 'y', 'z' } };

    public static void lettersCombination(String input) {
        int len = input.length();
        if (len == 0) {
            System.out.println("");
            return;
        }
        KeypadCombination(0, len, new StringBuilder(), input);
    }

    public static void KeypadCombination(int pos, int len, StringBuilder sb, String input) {
        if (pos == len) {
            System.out.println(sb.toString());
        } else {
            char[] letters = L[Character.getNumericValue(input.charAt(pos))];
            for (int i = 0; i < letters.length; i++) {
                KeypadCombination(pos + 1, len, new StringBuilder(sb).append(letters[i]), input);
            }
        }
    }

    public static void main(String[] args) {
        lettersCombination("2");
    }
}