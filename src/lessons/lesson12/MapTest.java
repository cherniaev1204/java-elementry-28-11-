package lessons.lesson12;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

    public static void main(String[] args) {

        Map<Integer, String> strings = new HashMap<>(Map.of(
                1, "val1",
                2, "val2",
                3, "val3",
                4, "val4"
        ));
        for (Map.Entry<Integer, String> entry : strings.entrySet()) {
            System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
        }
        System.out.println("__________________");

        strings.forEach((key, value) -> System.out.println("key: " + key + ", value: " + value));

        System.out.println("__________________");
        strings.putIfAbsent(3, "new val3");
        strings.forEach((key, value) -> System.out.println("key: " + key + ", value: " + value));

        System.out.println("__________________");
        String string = strings.computeIfPresent(3, (key, value) -> value + key);
        System.out.println(string);

        strings.forEach((key, value) -> System.out.println("key: " + key + ", value: " + value));

        System.out.println("__________________");
        String string3 = strings.computeIfAbsent(666, (key -> "value for " + key));
        System.out.println(string3);
        strings.forEach((key, value) -> System.out.println("key: " + key + ", value: " + value));

        System.out.println("__________________");
        strings.remove(666, "value for 666");
        strings.forEach((key, value) -> System.out.println("key: " + key + ", value: " + value));

        strings.merge(1, "new value", (newValue, oldValue) -> oldValue + newValue);
        System.out.println("__________________");
        strings.forEach((key, value) -> System.out.println("key: " + key + ", value: " + value));

        String string5 = strings.getOrDefault(3,"default value");
        System.out.println(string5);

        String string6 = strings.getOrDefault(33,"default value");
        System.out.println(string6);

    }
}
