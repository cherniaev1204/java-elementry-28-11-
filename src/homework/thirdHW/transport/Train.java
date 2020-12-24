package homework.thirdHW.transport;

public class Train extends Transport {
    int numberOfCarriages;

    @Override
    public void sound() {
        System.out.println("chuh-chuh chuh-chuh");
    }

    public Train(String model, String bar, int speed, int numberOfCarriages) {
        this.numberOfCarriages = numberOfCarriages;
        this.model = model;
        this.speed = speed;
        this.bar = bar;
    }
}
