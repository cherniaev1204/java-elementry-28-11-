package homework.task26;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        List<Thread> threads = new ArrayList<>();
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(counter);
            executorService.submit(thread);
            threads.add(thread);
        }

        for (Thread thr : threads) {
            thr.join();
            System.out.println(thr.getName() + " joined");
        }
        System.out.println("Counted " + Counter.getCOUNT());
    }
}


class Counter implements Runnable {
    public static int COUNT;

    public static int nextCounter() {
        return COUNT++;
    }

    public static int getCOUNT() {
        return COUNT;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            nextCounter();
        }
    }
}
