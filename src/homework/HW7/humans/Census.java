package homework.HW7.humans;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Census {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String,String> census = new HashMap<>();

        while(true){
            System.out.println("Введите город:");
            String city = reader.readLine();
            if (city.isEmpty()){
                break;
            }
            System.out.println("Введите фамилию:");
            String surname = reader.readLine();
            if (surname.isEmpty()){
                break;
            }
            census.put(city,surname);
        }
        System.out.println("Введите город:");
        String findYourCity = reader.readLine();
        System.out.println(census.getOrDefault(findYourCity, "Такого города нет"));
    }
}
