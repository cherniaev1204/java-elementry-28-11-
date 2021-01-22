package homework.thirdHW.tax;

public class TaxMain {
    public static void main(String[] args) {
        Tax living = new Living(100,5, 10);
        System.out.println(living.taxPay(100,5));

        Tax commercial = new Commercial(20, 2, 500);
        System.out.println(commercial.taxPay(20,2));

        Tax industrial = new Industrial(50,20);
        System.out.println(industrial.taxPay(50,20));
    }
}
