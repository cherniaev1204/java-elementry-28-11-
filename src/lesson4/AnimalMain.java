package lesson4;

import java.util.List;

public class AnimalMain {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.name = "name";


        Cat cat = new Cat();
        cat.name = "name";


        Parrot parrot = new Parrot();
        parrot.name = "parrot";

        List<Animal> animals = List.of(dog, cat, parrot);
        for (Animal an : animals) {
            an.print();
            an.say();
            if (an instanceof Cat){
                Cat catAnimal = (Cat) an;
                catAnimal.mur();
            }
        }

    }
}
