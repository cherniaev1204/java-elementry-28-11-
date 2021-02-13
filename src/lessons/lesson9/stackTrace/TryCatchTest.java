package lessons.lesson9.stackTrace;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryCatchTest {
    public static void main(String[] args){
        method1();
        System.out.println("after method1");
    }

    public static void method1(){
        method2();
        System.out.println("after method2");
    }

    public static void method2() {
        method3();
        System.out.println("after method3");
    }

    public static void method3() {
        try {
            method4();
        } catch (Exception exception) {
            System.out.println("invalid input");
        }
        System.out.println("after method4");
    }

    private static void method4() {

        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.out.println(stackTrace.toString());
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = null;
        try {
            input = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (input.equals("throw")) {
            throw new RuntimeException("my exception");
        }
        System.out.println("after exception");
    }
}
//        try {
//            if (input.equals("throw")) {
//                throw new RuntimeException("my exception");
//            }
//        } catch (Exception exception) {
//            System.out.println("invalid input");
//        }