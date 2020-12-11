package homework;

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
            builder.append(main + ", ");
        }
        System.out.println(builder);
    }
}
