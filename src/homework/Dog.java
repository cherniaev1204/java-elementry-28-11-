package homework;

import lesson2.Person;

public class Dog {
    String breed;
    String name;
    int age;
    int weight;

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }



    public boolean equalsA(Dog dog) {
        if (age != 0) return Integer.toString(age).equals(Integer.toString(dog.age));
        return dog.age == 0;
    }

    public boolean equalsW(Dog dog) {
        if (weight != 0) return Integer.toString(weight).equals(Integer.toString(dog.weight));
        return dog.weight == 0;
    }
}
