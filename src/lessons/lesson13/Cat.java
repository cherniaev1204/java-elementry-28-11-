package lessons.lesson13;

import java.io.Serializable;

public class Cat implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String name;
    private final int age;
    private final int weight;
    transient int lifeNumbers = 9; // transient = игнорирование поля, при чтении и записывании поле будет игнорироваться

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", lifeNumbers=" + lifeNumbers +
                '}';
    }
}
