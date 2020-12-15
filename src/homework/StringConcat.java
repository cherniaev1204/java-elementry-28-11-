package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringConcat {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sum = "";
        while (true) {
            String main = reader.readLine();
            if (main.equals("хватит")) {
                break;
            }
//            sum = sum + main + ", ";
        stringAppend(main);
        }
        System.out.println(sum.substring(sum.length() - 2));
    }

    public static String stringAppend(String main) {
        String sum = "";
        sum = sum + main + ", ";
        return sum;
    }
}
