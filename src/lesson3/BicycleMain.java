package lesson3;

public class BicycleMain {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("model1", 70);
        Bicycle.Seat seat = bicycle.new Seat();
        Bicycle.SteeringWheel wheel = bicycle.new SteeringWheel();
        wheel.left();
        wheel.right();
        seat.up();
        seat.up();
        seat.up();
        seat.up();
        seat.up();
        seat.down();
        seat.down();
        seat.down();
        seat.down();
        System.out.println(bicycle);
    }
}
