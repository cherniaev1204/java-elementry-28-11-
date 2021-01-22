package homework.thirdHW.tax;

public class Industrial extends Tax {

    public Industrial(int S, int taxK) {
        this.S = S;
        this.taxK = taxK;
    }

    public int taxPay(int S, int taxK) {
        return S * taxK;
    }
}
