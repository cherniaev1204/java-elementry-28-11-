package homework.secondHW;

public class Main {
    public static void main(String[] args) {
        System.out.println(Util.getDistance(2,4,5,6));
    }
    public static class Util{
        public static double getDistance(double x1, double x2, double y1, double y2){
            return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1,2));
        }
    }
}
