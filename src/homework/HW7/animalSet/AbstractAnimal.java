package homework.HW7.animalSet;

public class AbstractAnimal {
    String name;

    public AbstractAnimal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                '}';
    }
}
