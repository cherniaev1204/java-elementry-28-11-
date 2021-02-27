package lessons.lesson11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.*;

public class StringChangerTest {

    public static void main(String[] args) throws IOException {
        Supplier<String> stringSupplier = () -> {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try {
                return reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        };

        String inputString = stringSupplier.get();

//        UnaryOperator<String> reverseFunction = stringToReverse -> new StringBuilder(stringToReverse).reverse().toString();
        UnaryOperator<String> reverseFunction = stringToReverse -> new StringBuilder(stringToReverse).reverse().toString();

//        Predicate<String> predicateCheck = string -> string.isEmpty();
        Predicate<String> predicateCheck = String::isEmpty;

//      Function<String, String> reverseFunction = stringToReverse -> new StringBuilder(stringToReverse).reverse().toString();

        UnaryOperator<String> upperCaseFunction = String::toUpperCase;

//        Function<String, Integer> countFunction = stringForCount -> stringForCount.length();
        Function<String, Integer> countFunction = String::length;

//        Consumer<String> printer = stringToPrint -> System.out.println(stringToPrint);
        Consumer<String> printer = System.out::println;

        System.out.println(countFunction.apply(inputString));

        changeString(inputString, reverseFunction);
        changeString(inputString, upperCaseFunction);
        printer.accept(inputString);
        System.out.println(predicateCheck.test(inputString));
    }

    public static void changeString(String string, Function<String, String> function) {
        String newString = function.apply(string);
        System.out.println(newString);
    }


}
