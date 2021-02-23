package lessons.lesson10;

public class ThreadTest {
    public static void main(String[] args) {
        Thread thread = new NewPrinter("my-printer");
        thread.start();

        System.out.println(thread.getName() + " started");


        Thread thread2 = new NewPrinter("child-printer");
        System.out.println(thread2.getName() + " started");
        thread2.start();

    }
}


