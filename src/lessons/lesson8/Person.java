package lessons.lesson8;

public class Person implements Comparable<Person>{
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Person person) {
        if (this.age > person.age){
            return -1;
        }else if (this.age < person.age){
            return 1;
        }
        return 0;
    }
}
