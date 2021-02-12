package homework.HW7.animalSet;

import java.util.HashSet;
import java.util.Set;

public class Cat extends AbstractAnimal {
    public Cat(String name) {
        super(name);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> cats = new HashSet<>();
        for (int i = 0; i <= 4; i++) {
            Cat cat = new Cat("Cat " + i);
            cats.add(cat);
        }
        return cats;
    }
}
