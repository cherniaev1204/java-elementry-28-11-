package homework.task24;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        FileInputStream inputStream;
        String copyFile;
        try {
            System.out.println("File name which you will copy:");
            fileName = reader.readLine();
            inputStream = new FileInputStream(fileName);
        } catch (IOException e) {
            System.out.println("Файл не существует.");
            System.out.println("Write file name one more time");
            fileName = reader.readLine();
            inputStream = new FileInputStream(fileName);
        }
        System.out.println("Type file name in which you will copy: ");
        copyFile = reader.readLine();
        FileOutputStream stream = new FileOutputStream(copyFile);
    }
}
