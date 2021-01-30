package lessons.lesson2;

public class PersonTest {
    public static void main(String[] args) {
//
//        Person person = new Person();
//        person.age = 2;
//        person.name = "Iliya";
//        System.out.println(person.name + " " + person.age);
//        Person person2 = person;
//
//        changePerson(person2);
//
//        printPerson(person);
//
//        printPerson(person2);
//

        Person person1 = new Person();
        person1.setName("Masha");
       person1.setAge(15);
        Person person2 = new Person();
        person1.setName("Maxim");
        if (person1.equals(person2)) {
            System.out.println("persons are equal");
        } else {
            System.out.println("persons are not equal");
        }
    }


    public static void changePerson(Person person) {
        person.setName(person.getName() + "Changed");
        person.setAge(person.getAge() + 100);
    }

    public static void printPerson(Person person) {
        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}
