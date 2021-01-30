package homework.thirdHW.tax;

public class Living extends Tax {
    int subsidies;

    public Living(int S, int taxK, int subsidies) {
        this.S = S;
        this.taxK = taxK;
        this.subsidies = subsidies;

    }



//    @Override
//    public int taxPay(int S, int taxK) {
//        return (int) ((S * taxK) - (S * taxK * (subsidies * 0.01)));
//    }
}
