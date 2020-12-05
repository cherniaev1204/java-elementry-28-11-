package lesson2;

public class ClassTest {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat cat1 = cat;
        Cat cat2 = new Cat();
        System.out.println("Another cat " + cat);
        System.out.println(cat2);
    }
}
