package lessons.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListCatMain {
    public static void main(String[] args) throws IOException {

        ArrayList<Cat> cats = new ArrayList<>();
        Cat cat1 = new Cat("Vasiliy");
        cats.add(cat1);

        cats.add(new Cat("Murka"));
        cats.add(new Cat("Kuzia"));
        cats.add(new Cat("Simona"));
        cats.add(new Cat("Sonia"));

        System.out.println("Before : " + cats.toString());
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();

        // cannot to do this because of ConcurrentModificationExceptio
//       for (Cat cat : cats) {
//            if (cat.name.equals(name)) {
//                cats.remove(cat);
//            }
//        }
        Iterator<Cat> catIterator = cats.iterator();
        while (catIterator.hasNext()) {
            Cat cat = catIterator.next();
            if (cat.name.equals(name)) {
                catIterator.remove();
            }

        }
        cats.removeIf(cat -> cat.name.equals(name));

        System.out.println("After : " + cats.toString());
    }
}
