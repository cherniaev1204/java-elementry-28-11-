package lessons.lesson13;

import java.io.*;

import static lessons.lesson13.FileUtils.readFromFile;
import static lessons.lesson13.FileUtils.writeToFile;

public class CatMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Cat cat = new Cat("Vasiliy", 10, 10);
        writeToFile(cat, "cat.dat");

        Cat catFromFile = (Cat) readFromFile("cat.dat");
        System.out.println(catFromFile);
    }

}
