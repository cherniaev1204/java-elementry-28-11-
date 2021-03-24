package homework.task22;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader mainReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Выберите оперцию: READ или WRITE");
        String input;
        while (!(input = mainReader.readLine()).isEmpty()) {
            FunctionEnum functionEnum = FunctionEnum.valueOf(input.toUpperCase());
            switch (functionEnum) {
                case READ:
                    System.out.println(read());
                    break;
                case WRITE:
                    System.out.println(write());
                    break;
                default:
                    System.out.println("Неправильный ввод!:/");
            }
        }
    }

    public static String read() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String userText;
        Worker name, age, city;

        try {
            System.out.println("Введите имя файла из которого хотите прочитать данные: ");
            userText = reader.readLine();
            reader = new BufferedReader(new FileReader(userText));
            name = new Worker(reader.readLine());

        } catch (FileNotFoundException e) {
            System.out.println("Такого файла не существует");
            userText = reader.readLine();
            reader = new BufferedReader(new FileReader(userText));

        }
        return;
    }

    public static String write() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String userText;
        Worker name, city, age;
        try {
            System.out.println("Введите название файла: ");
            userText = reader.readLine();
            System.out.println("Введите данные: ");
            FileOutputStream stream = new FileOutputStream(userText);
            userText = ;    // сюда должны идти данные о пользователе
            stream.write(userText.getBytes());
        } catch (FileNotFoundException e) {
            System.out.println("Такого файла не существует");
            System.out.println("Попробуйте еще раз!");
            System.out.println("Введите название файла: ");
            userText = reader.readLine();
            System.out.println("Введите данные: ");
            FileOutputStream stream = new FileOutputStream(userText);

            userText = ;
            stream.write(userText.getBytes());
        }
        return;
    }
}
