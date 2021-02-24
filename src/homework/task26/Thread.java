package homework.task26;

public class Thread extends java.lang.Thread {
    public static int COUNT;

    public static int nextCounter() {
        return COUNT++;
    }

    public static void main(String[] args) {
//        Thread thread = new Thread();
//        Thread thread1 = new Thread();
//        Thread thread2 = new Thread();
//        Thread thread3 = new Thread();
//        Thread thread4 = new Thread();
//        Thread thread5 = new Thread();
//        Thread thread6 = new Thread();
//        Thread thread7 = new Thread();
//        Thread thread8 = new Thread();
//        Thread thread9 = new Thread();
    }

}
class Counter implements Runnable{
    public static int COUNT;

    public static int nextCounter() {
        return COUNT++;
    }
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            nextCounter();
        }
    }
}