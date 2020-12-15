package homework.firstHW.concat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuilderConcat {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        while (true) {
            String main = reader.readLine();
            if (main.equals("хватит")) {
                break;
            }
            stringAppend(main);
        }
        builder.deleteCharAt(builder.length() - 2);
        System.out.println(builder);
    }


    public static String stringAppend(String main) {
        String m2 = "";
        m2 = m2 + main + ", ";
        return m2;
    }
}
