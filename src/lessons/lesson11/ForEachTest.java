package lessons.lesson11;

import java.util.List;
import java.util.function.Supplier;

public class ForEachTest {

    public static void main(String[] args) {

        List<String> strings = List.of("one", "two", "three");
        strings.forEach(ForEachTest::print);


        Supplier<String> stringSupplier = String::new;
        String newString = stringSupplier.get();
//        Supplier<String> stringSupplier1 = () -> new String();
    }

    public static void print(String string) {
        System.out.println("-----------");
        System.out.println(string);;
    }
}
