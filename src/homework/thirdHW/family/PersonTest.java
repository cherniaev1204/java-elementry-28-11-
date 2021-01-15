package homework.thirdHW.family;

public class PersonTest {
    String name;


    public static void main(String[] args) {
        Mother mother = new Mother("Mom");
        Father father = new Father("Dad");
        Child child = new Child("Child");
        System.out.println("Family: Mother: " + mother.name + "; Father: " + father.name + "; Child " + child.name);
        Mother secondMother = new Mother("Mom");
        Father secondFather = new Father("Dad");
        Child secondChild = new Child("Child");
        System.out.println("Family: Mother: " + secondMother.name + "; Father: " + secondFather.name + "; Child " + secondChild.name);
    }
}
