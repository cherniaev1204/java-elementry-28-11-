package lessons.lesson5.moves;

public class Human implements Swimmable, Runnable {
    @Override
    public void run() {
        System.out.println("Human runs");
    }

    @Override
    public void swim() {
        System.out.println("Human swims");
    }
}
