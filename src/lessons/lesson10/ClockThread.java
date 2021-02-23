package lessons.lesson10;

public class ClockThread extends Thread {

    @Override
    public void run() {
        while (!isInterrupted()) {
            try {
                Thread.sleep(1000);
                System.out.println("Tik");
            } catch (InterruptedException e) {
                e.printStackTrace();
                return;
            }

        }
    }
}

