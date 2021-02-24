package homework.task24;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        FileInputStream fileInputStream;
        String copyFile;
        FileOutputStream fileOutputStream;
        try {
            System.out.println("Type file name which you will copy:");
            fileName = reader.readLine();
            fileInputStream = new FileInputStream(fileName);

        } catch (IOException e) {
            System.out.println("Файл не существует.");
            System.out.println("Write file name one more time");
            fileName = reader.readLine();
            fileInputStream = new FileInputStream(fileName);

        }
        try {
            System.out.println("Type file name in which you will copy: ");
            copyFile = reader.readLine();
            fileOutputStream = new FileOutputStream(copyFile);
        } catch (IOException e) {
            System.out.println("Файл не существует.");
            System.out.println("Write file name one more time");
            copyFile = reader.readLine();
            fileOutputStream = new FileOutputStream(copyFile);
        }
        while (fileInputStream.available() > 0) {
            int text = fileInputStream.read();
            fileOutputStream.write(text);
        }
        fileOutputStream.close();
        fileInputStream.close();
    }
}
