package lessons.lesson9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileWithCloseTest {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new java.io.FileReader("C:\\Users\\Сlass9-PC10\\Desktop\\test.txt"))) {
            String firstString = reader.readLine();
            System.out.println(firstString);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
