public class copyconstructors {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "abhi";
        s1.roll = 71;

        System.out.println(s1.name);
        System.out.println(s1.roll);
        Student s2 = new Student(s1);

        System.out.println(s2.name);
        System.out.println(s2.roll);

    }
}

class Student {
    int roll;
    String name;

    Student() {
        this.name = name;
        this.roll = roll;
    }

    // COPY CONSTRUCTOR
    Student(Student s1) {
        this.name = s1.name;
        this.roll = s1.roll;

    }
}
