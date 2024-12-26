
public class statickeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolname = "abc";
        Student s2 = new Student();
        s2.schoolname = "Def";
        System.out.println(s2.schoolname);
        System.out.println(Student.percentage(32, 45, 67));
        System.out.println(Student.percentage(45, 87, 56));
    }

}

class Student {
    String name;
    int rollno;
    static String schoolname;

    static int percentage(int math, int phy, int che) {
        return (math + phy + che) / 3;
    }

    void setname(String name) {
        this.name = name;
    }
}