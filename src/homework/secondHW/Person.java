package homework.secondHW;
public class Person {

    String name;

    public Person(String name) {
        this.name = name;
    }

    public class Account {
        String password;

        public Account(String password) {
            this.password = password;
        }

        public void displayAccount(Person person) {
            System.out.println("Person " + person.name + " his password " + password);
        }
    }
}
