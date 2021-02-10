package homework.fourthHW.convert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите градусы ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int grades = Integer.parseInt(reader.readLine());
        String input;
        Converter object = null;
        BufferedReader readerForGrades = new BufferedReader(new InputStreamReader(System.in));
        while (!(input = readerForGrades.readLine()).isEmpty()) {
            switch (input) {
                case "Фаренгейты":
                    object = new Farengeit();
                case "Кельвины":
                    object = new Calvin();
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
        assert object != null;
        System.out.println(object.convert(grades));
    }
}
