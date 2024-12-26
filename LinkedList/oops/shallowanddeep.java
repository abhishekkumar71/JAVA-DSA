public class shallowanddeep {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.marks[0] = 71;
        s1.marks[1] = 77;
        s1.marks[2] = 97;
        Student s2 = new Student(s1);
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }

    }
}

class Student {
    int marks[];

    Student() {
        marks = new int[3];
        System.out.println("Abhiii");
    }

    Student(Student s1) {
        marks = new int[3];
        for (int i = 0; i < 3; i++) {
            this.marks[i] = s1.marks[i];
        }
    }
}
