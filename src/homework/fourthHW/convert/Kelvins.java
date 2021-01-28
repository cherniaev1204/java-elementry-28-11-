package homework.fourthHW.convert;

public class Kelvins implements Converter{
    int kelv;
    int cels;
    @Override
    public void covert() {
        kelv = 273 + cels;
        System.out.println("Kelvins " + kelv);
    }
}
