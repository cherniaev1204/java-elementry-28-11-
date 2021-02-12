package homework.HW7.animalSet;


import java.util.HashSet;
import java.util.Set;

public class AnimalSet {
    public static void main(String[] args) {
        Set<Cat> catSet = Cat.createCats();
        Set<Dog> dogSet = Dog.createDogs();
        Set<Object> petSet = join(catSet, dogSet);

        System.out.println(catSet.toString());

        //removeCats(petSet,catSet);
        printPets(petSet);

    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> pets = new HashSet<>();
        pets.addAll(cats);
        pets.addAll(dogs);
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets) {
        System.out.println(pets.toString());
    }

}
