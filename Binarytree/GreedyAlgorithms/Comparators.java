
import java.util.*;

public class Comparators {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<Person>();
        list.add(new Person("ashwith", 34));
        list.add(new Person("abhi", 20));
        list.add(new Person("bharath", 24));
        list.add(new Person("vinay", 31));

        Collections.sort(list);
        System.out.println(list);
    }
}

class Person implements Comparable<Person> {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int compareTo(Person person) {
        if (this.age == person.age) {
            return 0;
        } else {
            return (this.age < person.age ? -1 : 1);
        }
    }

    public String toString() {
        return this.name + ":" + this.age;
    }

}
