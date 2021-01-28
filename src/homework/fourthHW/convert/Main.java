package homework.fourthHW.convert;

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
                case "Кельвины":
                    object = new Kelvins();
            }
            if (object instanceof Converter) {
                ((Converter) object).covert();
            }
        }
    }
}
