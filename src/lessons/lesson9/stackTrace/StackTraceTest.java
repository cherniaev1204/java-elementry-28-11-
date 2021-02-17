package lessons.lesson9.stackTrace;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StackTraceTest {
    public static void main(String[] args) throws IOException {
        method1();
        System.out.println("after method1");
    }

    public static void method1() throws IOException {
        method2();
        System.out.println("after method2");
    }

    public static void method2() throws IOException {
        method3();
        System.out.println("after method3");
    }

    public static void method3() throws IOException {
        method4();
        System.out.println("after method4");
    }

    private static void method4() throws IOException {

        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.out.println(stackTrace.toString());
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        if (input.equals("throw")) {
            throw new RuntimeException("my exception");
        }
        System.out.println("after exception");
    }

}
