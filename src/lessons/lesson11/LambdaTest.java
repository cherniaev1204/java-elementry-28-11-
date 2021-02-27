package lessons.lesson11;

import java.util.concurrent.atomic.AtomicInteger;

public class LambdaTest {
    public static void main(String[] args) {
        AtomicInteger counter = new AtomicInteger();

//        Runnable runnable = () -> counter.getAndIncrement();

        new Thread(() -> counter.getAndIncrement()).start();
    }
}
