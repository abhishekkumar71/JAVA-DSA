public class menu {
    public static int list(String menu[], String key) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i] == key) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        String menu[] = { "dosa", "idli", "vada", "onion dosa", "bonda", "roti" };
        String key = "idli";
        int index = list(menu, key);
        if (index == -1) {
            System.out.println("item not found");
        } else {
            System.out.println("item found at index: " + index);
        }

    }
}