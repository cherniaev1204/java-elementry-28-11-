package homework.thirdHW.tax;

public class TaxMain {
    public static void main(String[] args) {
        Tax living = new Living(100,5, 10);
        System.out.println();

        Tax commercial = new Commercial(20, 2, 10);


        Tax industrial = new Industrial(50,20);

    }
}
