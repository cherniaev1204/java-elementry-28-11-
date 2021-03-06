package homework.fourthHW.zoo;

public class Tiger extends AbstractAnimal implements Runnable, Climable {

    @Override
    public void climb() {
        System.out.println("Tiger climbs");
    }

    @Override
    public void run() {
        System.out.println("Tiger runs");
    }
}
