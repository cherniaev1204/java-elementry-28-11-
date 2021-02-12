package homework.HW7.humansMap;


import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HumansMap {
    public static void main(String[] args) {
        Map<String, LocalDate> people = new HashMap<>();
        people.put("Ivanov", LocalDate.of(1989, 7, 12));
        people.put("Slavchenkov", LocalDate.of(2005, 6, 21));
        people.put("Vlasov", LocalDate.of(1968, 1, 29));
        people.put("Vladov", LocalDate.of(1965, 2, 1));
        people.put("Artemov", LocalDate.of(908, 12, 3));
        people.put("Nikitov", LocalDate.of(1941, 8, 4));
        people.put("Olegov", LocalDate.of(1939, 5, 5));
        people.put("Petrov", LocalDate.of(2010, 6, 6));
        people.put("Ivanov2", LocalDate.of(1956, 4, 7));
        people.put("Ivanov3", LocalDate.of(2007, 9, 8));
        System.out.println(people.toString());

        List<String> mapKeys = new ArrayList<>(people.keySet());

        for (String keys : mapKeys) {
            Month month = people.get(keys).getMonth();
            if (month == Month.JUNE || month == Month.JULY || month == Month.AUGUST) {
                people.remove(keys);
            }
        }
        System.out.println(people.toString());
    }
}
