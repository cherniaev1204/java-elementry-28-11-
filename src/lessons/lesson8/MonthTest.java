package lessons.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MonthTest {
    public static void main(String[] args) throws IOException {
        Month jan = Month.JANUARY;
        System.out.println(jan);
        System.out.println(jan.getName());

        MonthEnum jan2 = MonthEnum.JANUARY;
        System.out.println(jan2);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while (!(input = reader.readLine()).equals("exit")) {
            MonthEnum inputEnum = MonthEnum.valueOf(input.toLowerCase());  // input toUpperCase/toLowerCase
            switch (inputEnum) {
                case JANUARY:
                case FEBRUARY:
                case DECEMBER:
                    System.out.println("winter");
                    break;
                case MARCH:
                case APRIL:
                case MAY:
                    System.out.println("spring");
                    break;
                case JUNE:
                case JULY:
                case AUGUST:
                    System.out.println("summer");
                    break;
                case SEPTEMBER:
                case OCTOBER:
                case NOVEMBER:
                    System.out.println("autumn");
                    break;
            }

        }
    }
}