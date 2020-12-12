package lesson3;

import java.sql.SQLOutput;

public class Bicycle {
    String model;
    int height;

    public Bicycle(String model, int height) {
        this.model = model;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "model='" + model + '\'' +
                ", height=" + height +
                '}';
    }

    public void ride() {
        System.out.println("ride!");

    }

    public class SteeringWheel {

        public void left() {
            System.out.println("left");
        }

        public void right() {
            System.out.println("right");
        }
    }

    public class Seat {

        public void up() {
            height++;
            System.out.println("up");
        }

        public void down() {
            height--;
            System.out.println("down");
        }
    }
}
