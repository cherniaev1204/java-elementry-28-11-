package lessons.lesson5.phone;

public abstract class AbstractPhone {
    private int year;

    public AbstractPhone(int year) {
        this.year = year;

    }

    public void printYear() {
        System.out.println("Year: " + year);
    }

    public abstract void call(String outputNumber);

    public abstract void ring(String inputNumber);
}
