package homework.thirdHW.transport;

public class Plane extends Transport {
    int numberOfPassengers;

    public void sound() {
        System.out.println("shhhhh");

    }

    public Plane(String model, String bar, int speed, int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
        this.model = model;
        this.speed = speed;
        this.bar = bar;
    }

}
