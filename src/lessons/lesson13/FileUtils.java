package lessons.lesson13;

import lessons.lesson13.passwordAndUser.User;

import java.io.*;

public class FileUtils {

    public static void writeToFile(Object object, String fileName) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(object);
        fileOutputStream.close();
        objectOutputStream.close();
    }

    public static Object readFromFile(String fileName) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(fileName);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Object object = objectInputStream.readObject();
        fileInputStream.close();
        objectInputStream.close();
        return (Object) object;
    }

}
