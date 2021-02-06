package lessons.lesson8;

public class GenericTest {
    public static void main(String[] args) {
        Integer integer = printAndGet(12);
        String string = printAndGet("string");
        Boolean bool = printAndGet(true);
        Person person = printAndGet(new Person("Name", 30));

        Printer<String> stringPrinter = new Printer<>("some string");
        System.out.println(stringPrinter);
        System.out.println(stringPrinter.getValue());

        Printer<Person> personPrinter = new Printer<>(new Person("Ivan", 40));
        System.out.println(personPrinter);
        System.out.println(personPrinter.getValue());
    }

    public static <T> T printAndGet(T object) {
        T anotherLink = object;
        System.out.println(object);
        return object;
    }
}
