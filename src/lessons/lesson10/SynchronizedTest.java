package lessons.lesson10;

public class SynchronizedTest {
    public static Swapper SWAPPER = new Swapper();

    public static void main(String[] args) {
        Thread thread1 = new SwapperThread();
        thread1.start();

        Thread thread2 = new SwapperThread();
        thread2.start();
    }

}

class SwapperThread extends Thread {
    @Override
    public void run() {

    }
}



