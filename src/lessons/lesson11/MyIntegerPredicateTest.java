package lessons.lesson11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyIntegerPredicateTest {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer number = Integer.parseInt(reader.readLine());


        //1. Regular Class
        MyIntegerPredicate predicate = new EvenPredicate();

        //2. Anonymous Class
        MyIntegerPredicate predicate2 = new MyIntegerPredicate() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        };

        //3. Lambda
        MyIntegerPredicate predicateEven = integer -> integer % 2 == 0;
        MyIntegerPredicate predicatePositive = integer -> integer > 0;
        MyIntegerPredicate predicateFive = integer -> integer % 5 == 0;

        checkNumberAndPrint(number, predicateEven);
        checkNumberAndPrint(number, predicatePositive);
        checkNumberAndPrint(number, predicateFive);

    }

    private static void checkNumberAndPrint(Integer number, MyIntegerPredicate predicate3) {
        System.out.println(predicate3.test(number));
    }
}

class EvenPredicate implements MyIntegerPredicate {

    @Override
    public boolean test(Integer integer) {
        return integer % 2 == 0;
    }
}