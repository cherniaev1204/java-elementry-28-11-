package homework.fourthHW.convert;

public class Farengeit implements Converter {

    @Override
    public int convert(int grades) {
        return (grades * 9 / 5) + 32;
    }
}
