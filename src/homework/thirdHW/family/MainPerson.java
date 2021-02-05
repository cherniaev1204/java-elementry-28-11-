package homework.thirdHW.family;

public class MainPerson {
    public static void main(String[] args) {
        Person maria = new Person("Maria");
        Person alex = new Person("Alex");
        Person fam1 = new Person("Vasya", maria, null);
        Person fam2 = new Person("Petr", maria, alex);
        System.out.println(fam1);
        System.out.println(fam2);
    }
}
