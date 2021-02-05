package homework.fourthHW.zoo;

public class Dog extends AbstractAnimal implements Runnable {
    @Override
    public void run() {
        System.out.println("Dog runs");
    }
}