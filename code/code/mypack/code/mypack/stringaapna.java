package code.mypack;

public class stringaapna {
    public static void main(String[] args) {
        // String name="tony";
        // String name2="stark";
        // if(name.compareTo(name2)==0)
        // {
        // System.out.println("strings are equal");
        // }
        // else{
        // System.out.println("Strings are not equal" );
        // }

        // STRING BUILDER
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
