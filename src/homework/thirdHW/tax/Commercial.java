package homework.thirdHW.tax;

public class Commercial extends Tax {
    int earnings;

    public Commercial(int S, int taxK, int earnings) {
        this.earnings = earnings;
        this.S = S;
        this.taxK = taxK;
    }

    public static int taxPay(int S, int taxK, int earnings) {
        if (earnings < 100) {
            System.out.println("Налог не взымается");
        }
        return S * taxK;

    }
}