package FirstLesson;

public class Recursion {
    public static void main(String[] args) {
//        for (int i = 0; i < 100; i++) {
//            recursionFucn();
//        }
        recursionFucn(0);
    }

    public static void recursionFucn(int number) {
        System.out.println("Number " + number);
        System.out.println("Привет, Java!");
        if (number >= 100) {
            return;
        }
        recursionFucn(number + 1);
    }
}
