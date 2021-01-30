package lessons.lesson1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws  Exception{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int[] ints = new int[a];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = i;
            if (ints[i] % 2 == 0) {
                System.out.println("четное " + ints[i]);
            } else {
                System.out.println("нечетное " + ints[i]);
            }
//            System.out.println(ints[i]);
        }

    }
}
