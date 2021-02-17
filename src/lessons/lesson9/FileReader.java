package lessons.lesson9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new java.io.FileReader("C:\\Users\\Сlass9-PC10\\Desktop\\test.txt"));
            String firstString = reader.readLine();
            System.out.println(firstString);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("А вот и блок finally!");
            if (reader != null){
                reader.close();
            }
        }
    }
}
