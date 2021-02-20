package lessons.lesson10;

public class Runnable {
    public static void main(String[] args) {
        Printer printer = new Printer("main-printer");
        Thread childThread = new Thread(printer);
        childThread.start();

        System.out.println(printer.name + " started");


        Printer printer2 = new Printer("child-printer");
        Thread childThread2 = new Thread(printer2);
        childThread2.start();

        System.out.println(printer2.name + " started");

        Thread thread3 = new Thread(printer2);
        thread3.start();
        System.out.println(printer2.name + " second started");

        System.out.println("Main thread finished");

    }
}


class Printer implements java.lang.Runnable {
    String name;

    public Printer(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("I'm " + name);
        System.out.println(name + " thread finished");
    }
}