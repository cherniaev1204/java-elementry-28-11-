package lessons.lesson6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMain {
    public static void main(String[] args) {
//        create array vs arrayList
        String[] arrStrings = new String[10];
        ArrayList<String> arrListStrings = new ArrayList<>();


        //           fill
        for (int i = 0; i < arrStrings.length; i++) {
            arrStrings[i] = "arr " + i;
            arrListStrings.add(i, "arrList " + i);
        }
        //   get length
        System.out.println(arrStrings.length);
        System.out.println(arrListStrings.size());
        System.out.println(arrStrings[3]);
        System.out.println(arrListStrings.get(3));

        arrStrings[3] = "new arr " + 3;

        arrListStrings.set(3, "new arrList " + 3);

        System.out.println(arrStrings[3]);

        System.out.println(arrListStrings.get(3));

        arrListStrings.add(10, "add to the end");

//        arrStrings[10] = "add to the end"; cannot do this

        System.out.println("Size before add to the middle " + arrListStrings.size());

        arrListStrings.add(3, "add to the middle");

        System.out.println(arrListStrings.get(10));
//        arrStrings[3] = "add to the middle"; cannot do this, because we override 3 element
        System.out.println("Size after add to the middle " + arrListStrings.size());

        for (String str : arrListStrings) {
            System.out.println(str);
        }

        System.out.println("-------------------");

        arrListStrings.add(0, "add to the beginning");

        for (String str : arrListStrings) {
            System.out.println(str);
        }

        System.out.println("-----------Remove in array------------");

        arrStrings[4] = null;
        for (String str : arrStrings) {
            System.out.println(str);
        }
//       remove by index
        arrListStrings.remove(4);
        for (String str : arrListStrings) {
            System.out.println(str);
        }

        //   toString
        System.out.println(arrListStrings.toString());

        //     Array to List
        List<String> newList = Arrays.asList(arrStrings);
        System.out.println(newList.toString());

        //List to Array
        Object[] newArray = newList.toArray();
    }
}