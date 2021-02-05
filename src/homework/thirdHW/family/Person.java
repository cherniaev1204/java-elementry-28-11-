package homework.thirdHW.family;

public class Person {

    private String name;
    private Person mother;
    private Person father;


    public Person(String name) {
        this.name = name;
    }

    public Person(String name, Person mother, Person father) {
        this.name = name;
        this.mother = mother;
        this.father = father;
    }


    @Override
    public String toString() {
        String result = "Person name: " + name + ". ";
        result += "Father: " + (this.father != null ? this.father.name : "no father") + ". ";
        result += "Mother: " + (this.mother != null ? this.mother.name : "no mother");
        return result;
    }

}

