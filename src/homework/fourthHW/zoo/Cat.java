package homework.fourthHW.zoo;

public class Cat extends AbstractAnimal implements Climable, Runnable {
    @Override
    public void climb() {
        System.out.println("Cat climbs");
    }

    @Override
    public void run() {
        System.out.println("Cat runs");
    }
}
