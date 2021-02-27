package lessons.lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayComparatorTest {
    public static void main(String[] args) {
        String[] array1 = {"мама", "мыла", "раму"};
        String[] array2 = {"one", "two", "three", "four"};
        String[] array3 = {"мир", "труд"};
        List<String[]> strings = new ArrayList<>(List.of(array1, array2, array3));
        printResult(strings);
        /*new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return o1.length - o2.length;
            }
        };*/
        strings.sort((o1, o2) -> o1.length - o2.length);
        printResult(strings);
    }

    public static void printResult(List<String[]> strings) {
        System.out.println("_____________");
        for (String[] str : strings) {
            System.out.println(Arrays.toString(str));
        }
    }
}

