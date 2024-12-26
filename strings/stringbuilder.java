public class stringbuilder {

    public static void main(String[] args) {

        StringBuilder name = new StringBuilder("abhi");

        // .setCharAt
        name.setCharAt(0, 'b');
        System.out.println(name);

        // .insert
        name.insert(0, 'm');
        System.out.println(name);
        // .delete
        name.delete(0, 2);
        System.out.println(name);
        // .append
        name.append("iii");
        System.out.println(name);
    }
}