package homework.fourthHW.convert;

public class Farengeit implements Converter {

    @Override
    public void convert(double grades) {
        double res = (grades * 9 / 5) + 32;
    }
}
