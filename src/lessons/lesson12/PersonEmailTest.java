package lessons.lesson12;

import java.util.List;
import java.util.stream.Collectors;

public class PersonEmailTest {
    public static void main(String[] args) {
        Person person1 = new Person("John",
                List.of("john1@gmail.com", "john2@gmail.com", "john3@gmail.com"));

        Person person2 = new Person("Liza",
                List.of("liza1@gmail.com", "liza2@gmail.com", "liza3@gmail.com"));

        Person person3 = new Person("Tom",
                List.of("tom1@gmail.com", "tom2@gmail.com", "tom3@gmail.com"));

        List<Person> people = List.of(person1, person2, person3);

        System.out.println("Without streams: ");
        for (Person person : people) {
            for (String email : person.getEmails()) {
                boolean isSent = sendEmail(email);
                System.out.println("Email send status: " + isSent);
            }
        }

        System.out.println("------------------------------------------------");

        System.out.println("With streams: ");
        people.stream()
                .flatMap(person -> person.getEmails().stream())
                .map(PersonEmailTest::sendEmail)
                .forEach(isSent -> System.out.println("Email send status: " + isSent));


        System.out.println("------------------------------------------------");
        String emails = people.stream()
                .flatMap(person -> person.getEmails().stream())
                .collect(Collectors.joining(","));

        sendEmail(emails);
    }

    public static boolean sendEmail(String email) {
        System.out.println("send email to " + email);
        return true;
    }


}
