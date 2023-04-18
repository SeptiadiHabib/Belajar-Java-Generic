package ProgramerGenerik.Application;

import ProgramerGenerik.Person;

import java.util.Arrays;
import java.util.Comparator;

public class ComparableApp {
    public static void main(String[] args) {

        Person[] people = {
                new Person("Habib","Cikarang"),
                new Person("Erik", "Rengas Bandung"),
                new Person("Aef", "Blokang")
        };

        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Arrays.sort(people, comparator);

        System.out.println(Arrays.toString(people));

    }
}
