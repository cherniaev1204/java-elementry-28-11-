package lesson2;

public class  StringTest {
    public static void main(String[] args) {
        String string = "";
        String string1 = "Some text";
        String string2 = new String("Test");

        System.out.println(string);
        System.out.println(string1);
        System.out.println(string2);

        StringBuffer buffer = new StringBuffer("Test");

        buffer.append("continue");
        buffer.append("ttt");
        System.out.println("StringBuffer append " + buffer.toString());

    }
}
