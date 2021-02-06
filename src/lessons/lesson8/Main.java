package lessons.lesson8;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Comparator<Person> personComparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getName().length() > o2.getName().length()){
                    return -1;
                }else if (o2.getName().length() > o1.getName().length()){
                    return 1;
                }
                return 0;
            }
        };
        Queue<Person> persons = new PriorityQueue<>(personComparator);
        Person person = new Person("Kate",19);
        Person person1 = new Person("Miroslav",20);
        Person person2 = new Person("Petro",30);
        Person person3 = new Person("Vlad",60);
        Person person4 = new Person("Vova",50);
        Person person5 = new Person("Vasiliy",10);

        persons.add(person);
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);

        System.out.println(persons.poll());
        System.out.println(persons.poll());
        System.out.println(persons.poll());
        System.out.println(persons.poll());
        System.out.println(persons.poll());
        System.out.println(persons.poll());




    }
}
