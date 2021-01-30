package homework.fourthHW.zoo;

public class Duck implements Runnable, Flyable {

    @Override
    public void fly() {
        System.out.println("Duck flies");
    }

    @Override
    public void run() {
        System.out.println("Duck runs");
    }
}
