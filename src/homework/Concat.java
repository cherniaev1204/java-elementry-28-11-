package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Concat {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sum = reader.readLine();
    }

//    public static String rightString(String sum) {
//        if (sum.equals("хватит")) {
//            return ;
//        }
//        return sum;
//    }

    public static String StringBuilder(String sum) {
        return (sum + " ,");
    }
}
