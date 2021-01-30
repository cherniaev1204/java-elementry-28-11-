package lessons.lesson2;

public class StringTest {
    public static void main(String[] args) {
        String string = "";
        String string1 = "Some text";
        String string2 = new String("Test");

        System.out.println(string);
        System.out.println(string1);
        System.out.println(string2);

        StringBuffer buffer = new StringBuffer("Test");
        StringBuilder builder = new StringBuilder("Java");
        builder.append(",");
        System.out.println("StringBuilder: " + builder.toString());
        buffer.append("continue");
        buffer.append("ttt");
        System.out.println("StringBuffer append " + buffer.toString());

    }
}
