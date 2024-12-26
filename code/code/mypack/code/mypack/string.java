package code.mypack;

public class string {
    public static void main(String[] args) {
        String name = "Abhi";
        System.out.println(name);
        // .length() returns the length of a string
        int a = name.length();
        System.out.print("length:");
        System.out.println(a);
        // or
        System.out.println(name.length());

        // .toLowerCase() converts the string to lower case
        System.out.print("name:");
        String lcase = name.toLowerCase();
        System.out.println(lcase);
        // or
        System.out.println(name.toLowerCase());

        // .toUpperCase() converts the string to upper case
        System.out.print("name:");
        String ucase = name.toUpperCase();
        System.out.println(ucase);
        // or
        System.out.println(name.toUpperCase());

        // .trim() removes the whitespaces
        String nontrimmedname = "    Abhi  ";
        System.out.println(nontrimmedname);
        System.out.print("trimmed name:");
        System.out.println(nontrimmedname.trim());

        // .substring() returns the substring from the given index value
        System.out.print("substring:");
        System.out.println(name.substring(2));

        // .subsring(start,end) returns the sub string from the starting index till
        // ending index. Ending index is excluded
        System.out.print("substring:");
        System.out.println(name.substring(1, 3));

        // .replace will replace an old character or target with a new one.
        System.out.print("string after replacement:");
        System.out.println(name.replace('b', 'h'));
        System.out.print("string after replacement:");
        System.out.println(name.replace("bhi", "hhh!"));

        // BOOLEAN
        // .startsWith("") returns true or false.
        System.out.print("the string starts with hg:");
        System.out.println(name.startsWith("hg"));

        // .endsWith("") returns true or false.
        System.out.print("the string ends with i:");
        System.out.println(name.endsWith("i"));

        // .charAt(index) returns the character at the given index position
        System.out.print("character at 3 index:");
        System.out.println(name.charAt(3));

        // .indexOf("") reutrns the index of the character or string from where it
        // starts
        System.out.print("index of b:");
        System.out.println(name.indexOf("b"));
        System.out.print("index of hi:");
        System.out.println(name.indexOf("hi"));

        // .indexOf("",start searching from) it searches from the given index and
        // returns the index of the character and returns -1 if it doesnot match
        String modifiedName = "abhiabhiabhi";
        System.out.print("Index of a in modified name:(start searching from 5");
        System.out.println(modifiedName.indexOf("a", 5));
        System.out.print("index of x:)");
        System.out.println(modifiedName.indexOf("x", 5));

        // .LastIndexOf() it searches the character from the end and returns the index
        // of the character or string
        System.out.print("last index of 'b':");
        System.out.println(modifiedName.lastIndexOf("b"));

        // .LastIndexOf("",index) it searches the character from the given index
        // value(ending) and returns the index of the character or string
        System.out.print("last index of 'b'start searching from 5:");
        System.out.println(modifiedName.lastIndexOf("b", 5));

        // .equals("sring") returns true if the string matches and false if it doesn't
        System.out.print("Does the string match:");
        System.out.println(name.equals("abhi"));

        // .equalsIgnoreCase("sring") it ignores the case (either upper or lower)returns
        // true if the string matches and false if it doesn't
        System.out.print("Does the string match:");
        System.out.println(name.equalsIgnoreCase("abhi"));

    }
}
