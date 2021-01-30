package homework.fourthHW.convert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите градусы ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while (!(input = reader.readLine()).isEmpty()) {
            Object object = null;
            switch (input) {
                case "Фаренгейты":
                    object = new Celsium();
                    System.out.println();
                case "Цельсии":
                    System.out.println();
                default:
                    System.out.println("Invalid input");
            }
        }
    }
}
