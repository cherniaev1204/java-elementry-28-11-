package homework.thirdHW.tax;

public class Living extends Tax {
    int subsidies;

    public Living(int S, int taxK, int subsidies) {
        this.S = S;
        this.taxK = taxK;
        this.subsidies = subsidies;
    }

    public void taxPay() {
            System.out.println((S * taxK) - (S * taxK * (subsidies * 0.01)));

    }
}