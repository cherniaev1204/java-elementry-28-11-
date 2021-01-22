package homework.fourthHW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while (!(input = reader.readLine()).isEmpty()) {
            Object object = null;
            switch (input) {
                case "cat":
                    object = new Cat();
                    break;
                case "duck":
                    object = new Duck();
                    break;
                case "tiger":
                    object = new Tiger();
                    break;
                case "dog":
                    object = new Dog();
                    break;

                default:
                    System.out.println("Invalid input");
            }
                if (object instanceof homework.fourthHW.Flyable) {
                    ((Flyable) object).fly();
                }
            if (object instanceof homework.fourthHW.Runnable) {
                ((homework.fourthHW.Runnable) object).run();
            }
            if (object instanceof Climable) {
                ((Climable) object).climb();
            }
        }
    }
}
