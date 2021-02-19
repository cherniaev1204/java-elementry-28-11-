package homework.task22;

public class Worker implements Comparable{
    String name;
    String surname;
    int salary;

    public Worker(String name, String surname, int salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
