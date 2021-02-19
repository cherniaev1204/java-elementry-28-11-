package homework.task25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class DateFormatter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        LocalDate localDate = LocalDate.parse(reader.readLine());
        String input;

        while (!(input = reader.readLine()).isEmpty()) {
            DateFormatEnum inputEnum = DateFormatEnum.valueOf(input.toUpperCase());
            switch (inputEnum) {
                case SLASH:
                    System.out.println(localDate.format(DateTimeFormatter.ofPattern("yyyy/MM/dd")));
                    break;
                case DOT:
                    System.out.println(localDate.format(DateTimeFormatter.ofPattern("yyyy.MM.dd")));
                    break;
                case LETTERS_MONTH:
                    System.out.println(localDate.format(DateTimeFormatter.ofPattern("yyyy-MMMM-dd")));
                    break;
                case UNDERSCORE:
                    System.out.println(localDate.format(DateTimeFormatter.ofPattern("yyyy_MM_dd")));
                    break;
                default:
                    System.out.println("Case not found!");
                    break;
            }
        }
    }
}