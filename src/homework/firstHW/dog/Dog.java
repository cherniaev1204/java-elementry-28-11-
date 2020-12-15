package homework.firstHW.dog;

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

    public boolean equals(Dog dog) {
        if (age != 0 && weight != 0) return age == dog.age && weight == dog.weight;
        return dog.age == 0 && dog.weight == 0;
    }
}
