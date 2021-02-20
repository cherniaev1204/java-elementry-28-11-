package lessons.lesson10;

public class Clocks {
    public static boolean IS_CLOCK_RUN = true;

    public static void main(String[] args) throws InterruptedException {
        ClockThread clockThread = new ClockThread();
        clockThread.start();
        Thread.sleep(5000);
        clockThread.interrupt();
    }
}

