package homework.fourthHW;

public class Cat implements Climable, Runnable {
    @Override
    public void climb() {
        System.out.println("Cat climbs");
    }

    @Override
    public void run() {
        System.out.println("Cat runs");
    }
}
