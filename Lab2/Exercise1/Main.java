package Exercise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {

    /*
     * Implement a class Person(name, cnp, address…) and create 5 objects of this class with 2 objects with equal values. Then :
     * • Put it in an ArrayList
     * • Put it in a HashSet -> implement equals and hashCode
     * • Put it in a TreeSet -> implement Comparable
     */

    public static void main(String[] args) {

        //Instance of the objects
        Person p1 = new Person("Dolli", "859-30-1073", "4848 Heath Park");
        Person p2 = new Person("Dolli", "859-30-1073", "4848 Heath Park");
        Person p3 = new Person("Cherlyn", "797-24-4325", "76148 Surrey Junction");
        Person p4 = new Person("Mace", "293-36-5688", "3154 Waywood Hill");
        Person p5 = new Person("Peta", "162-58-9366", "27872 Lyons Way");
        
        System.out.println("\t\tArrayList:");
        ArrayList<Person> personArrayList = new ArrayList<>(Arrays.asList(p1, p2, p3, p4, p5));
        personArrayList.forEach(person -> System.out.println(person.getName()));
        System.out.println("Size: " + personArrayList.size());

        System.out.println("\n\t\tHashSet:");
        HashSet<Person> personHashSet = new HashSet<>(Arrays.asList(p1, p2, p3, p4, p5));
        personHashSet.forEach(person -> System.out.println(person.getName()));
        System.out.println("Size: " + personHashSet.size());

        System.out.println("\n\t\tTreeSet:");
        TreeSet<Person> personTreeSet = new TreeSet<>(Arrays.asList(p1, p2, p3, p4, p5));
        personTreeSet.forEach(person -> System.out.println(person.getName()));
        System.out.println("Size: " + personTreeSet.size());

    }
}