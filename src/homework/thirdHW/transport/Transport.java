package homework.thirdHW.transport;



public class Transport {
    public static void main(String[] args) {
        Transport plane = new Plane("B12", "Yes.", 500, 200);
        Transport train = new Train("MTB12", "No.", 200, 10);
        plane.sound();
        train.sound();
    }

    String model;
    String bar;
    int speed;

    public Transport() {
    }

    public Transport(String model, String bar, int speed) {
        this.model = model;
        this.bar = bar;
        this.speed = speed;
    }

    public void sound() {
        System.out.println("Transport sound");
    }

}
