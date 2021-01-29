package homework.fourthHW.convert;

public interface Converter {
    double convertFarengeit(double grades) {
        double result = (grades * 9 / 5) + 32;
        return result;
    }

    double convertCelsium(double grades) {
        double result = grades + 273;
        return result;
    }
}
