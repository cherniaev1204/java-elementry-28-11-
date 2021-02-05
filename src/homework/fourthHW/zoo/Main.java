package homework.fourthHW.zoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while (!(input = reader.readLine()).isEmpty()) {
            AbstractAnimal animal = null;
            switch (input) {
                case "cat":
                    animal = new Cat();
                    break;
                case "duck":
                    animal = new Duck();
                    break;
                case "tiger":
                    animal = new Tiger();
                    break;
                case "dog":
                    animal = new Dog();
                    break;

                default:
                    System.out.println("Invalid input");
            }
                if (animal instanceof Flyable) {
                    ((Flyable) animal).fly();
                }
            if (animal instanceof Runnable) {
                ((Runnable) animal).run();
            }
            if (animal instanceof Climable) {
                ((Climable) animal).climb();
            }
        }
    }
}
