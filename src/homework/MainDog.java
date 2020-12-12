package homework;

public class MainDog {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setAge(10);
        dog.setBreed("Бульдог");
        dog.setName("Вася");
        dog.setWeight(10);
        Dog dog1 = new Dog();
        dog1.setAge(10);
        dog1.setWeight(1);

        if (dog.equals(dog1)) {
            System.out.println("true");
        } else {
            System.out.println("not true");
        }

    }
}
