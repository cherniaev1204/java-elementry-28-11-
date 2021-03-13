package lessons.lesson12;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {
        List<String> strings = List.of("one", "two", "three");

        Stream<String> stringStream = strings.stream();

        IntStream intStream = IntStream.of(10, 20, 30, 40, 50);
        Stream<Integer> integerStream = Stream.of(10, 10, 40, 40, 50);

        integerStream
                .distinct()
                .forEach(System.out::println);


        strings.stream()
                .filter(string -> string.length() == 3)
                .forEach(System.out::println);

        strings.stream()
                //.map(string -> string.length())
                .map(String::length)
                .forEach(System.out::println);

        List<Integer> numbers = List.of(10, 10, 40, 40, 50);
        System.out.println("Numbers > 10: " + numbers.stream()
                .filter(number -> number > 10)
                .count());


    }

}
