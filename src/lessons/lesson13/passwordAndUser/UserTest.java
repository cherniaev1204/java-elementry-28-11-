package lessons.lesson13.passwordAndUser;

import java.io.*;

import static lessons.lesson13.FileUtils.readFromFile;
import static lessons.lesson13.FileUtils.writeToFile;

public class UserTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user = new User("Vasiliy", "test");
        writeToFile(user, "user.dat");
        User userFromFile = (User) readFromFile("user.dat");
        System.out.println(user);
    }


}
