public class intern {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");
        String str3 = str1.intern();
        System.out.println(str1 == str2);// FALSE
        System.out.println(str1 == str3);// TRUE

    }
}
