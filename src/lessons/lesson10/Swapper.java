package lessons.lesson10;

public class Swapper {
    private String name1 = "Оля";
    private String name2 = "Лена";

    public void swap() {
        synchronized (this) {
            String s = name1;
            name1 = name2;
            name2 = s;
        }
    }

    public void printName() {
        System.out.println();
    }
}
