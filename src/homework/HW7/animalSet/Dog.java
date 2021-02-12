package homework.HW7.animalSet;

import java.util.HashSet;
import java.util.Set;

public class Dog extends AbstractAnimal {
    public Dog(String name) {
        super(name);
    }
    public static Set<Dog> createDogs() {
        HashSet<Dog> dogs = new HashSet<>();
        for (int i = 0; i <= 3; i++) {
            Dog dog = new Dog("Dog " + i);
            dogs.add(dog);
        }
        return dogs;
    }
}
