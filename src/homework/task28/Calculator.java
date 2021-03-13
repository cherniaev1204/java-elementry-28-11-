package homework.task28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class Calculator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        String operator = reader.readLine();
        Actions.calculate(num1, num2, operator);
    }
}

interface Calculate {
    int calculate(int num1, int num2);
};


enum Actions implements Calculate {
    ADD(Integer::sum),
    MINUS(((num1, num2) -> num1 - num2)),
    MULTIPLY(((num1, num2) -> num1 * num2)),
    DIVIDE(((num1, num2) -> num1 / num2));
    public static Map<String, Actions> operationsMap = Map.of(
            "ADD", Actions.ADD,
            "MULTIPLY", Actions.MULTIPLY,
            "DIVIDE", Actions.DIVIDE,
            "MINUS", Actions.MINUS
    );
    Calculate act;

    Actions(Calculate act) {
        this.act = act;
    }

    @Override
    public int calculate(int num1, int num2) {
        return act.calculate(num1, num2);
    }

    public static void calculate(int num1, int num2, String act) {
        System.out.println(operationsMap.get(act).calculate(num1, num2));
    }
}

