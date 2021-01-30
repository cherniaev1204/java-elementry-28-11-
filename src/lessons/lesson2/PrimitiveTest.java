package lessons.lesson2;

public class PrimitiveTest {
    public static void main(String[] args) {
        int age = 15;
        System.out.println("Age before: " + age);
        changeAge(15);
        System.out.println("Age after in method main " + age);
    }

    private static void changeAge(int age) {
        System.out.println("Age before in method changeAge " + age);
        age = age + 100;
        System.out.println("Age after in method changeAge " + age);
    }

}
