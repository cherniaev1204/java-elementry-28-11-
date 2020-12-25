package homework.thirdHW.tax;

public class Commercial extends Tax {
    int earnings;

    public Commercial(int S, int taxK, int earnings) {
        this.earnings = earnings;
        this.S = S;
        this.taxK = taxK;
    }

    public void taxPay() {
        if (earnings < 100) {
            System.out.println("Налог не взымается");
        } else {
            System.out.println(S * taxK);
        }
    }
}