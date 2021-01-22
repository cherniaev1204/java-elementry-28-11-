package homework.thirdHW.tax;

public class Commercial extends Tax {
    int earnings;

    public Commercial(int S, int taxK, int earnings) {
        this.earnings = earnings;
        this.S = S;
        this.taxK = taxK;
    }

    @Override
    public int taxPay(int S, int taxK) {
        if (earnings < 100) {
            return 0;
        }
        return S * taxK;
    }
}