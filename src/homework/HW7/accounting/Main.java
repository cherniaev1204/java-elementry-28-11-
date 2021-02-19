package homework.HW7.accounting;


/*Создать программу учета сотрудников, у которых есть имя, фамилия и зарплата.
Пользователь вводит данные о сотрудниках в консоли.
Сотрудники должны сохраняться в коллекцию TreeSet и
сортироваться по убываю зарплаты (используйте Comparator или Comparable).
Вывести список сотрудников в консоль*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name;
        String surname;
        int earnings;

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            System.out.println("Введите имя");
            name = reader.readLine();
            list.add(name);
            if (name.isEmpty()) {
                break;
            }

        }

    }
}
