package homework.task29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
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
        UnaryOperator<String> stringOperator = string -> {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < string.length(); i++) {
                builder.append(string.charAt(i)).append(string.charAt(i));
            }
            return builder.toString();
        };
        stringWriter(inputString, stringOperator);
    }

    public static void stringWriter(String string, UnaryOperator<String> stringOperator) {
        System.out.println(stringOperator.apply(string));
    }
}
