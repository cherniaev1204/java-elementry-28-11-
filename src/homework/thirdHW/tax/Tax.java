package homework.thirdHW.tax;

public class Tax {
    int S;
    int taxK;

    public int taxPay(int S, int taxK) {
        int tax = S * taxK;
        return tax;
    }
}
