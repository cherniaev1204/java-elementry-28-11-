package lesson3;

public class Cow {

    private String name;
    private int age;

    public Cow(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cow(int age) {
        this.age = age;
    }

    public Cow(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Cow name=" + name + ", age=" + age);
    }
}