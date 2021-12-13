public class CurrencyConvertor {
    private double walletAmount;
    public void addDollarInputToWallet(double inputDollars){
        walletAmount=walletAmount+dollarToRupees(inputDollars);
    }
    public void addRupeesInputToWallet(double inputRupees){
        walletAmount=walletAmount+inputRupees;
    }
    public void subtractRupeesInputFromWallet(double inputRupees){
        walletAmount=walletAmount-inputRupees;
    }
    public void subtractDollarInputFromWallet(double inputDollars){
        walletAmount=walletAmount-dollarToRupees(inputDollars);
    }

    public double getWalletAmount(String prefCurrency){
        if(prefCurrency=="Rs") {
            return walletAmount;
        }
        else if(prefCurrency=="$")
            return rupeesToDollar(walletAmount);
        else
            throw new IllegalArgumentException("Not a valid currency type");
    }

    public double dollarToRupees(double dollarAmount){
        return dollarAmount*74.85;
    }
    public double rupeesToDollar(double rupeesAmount){
        return rupeesAmount/74.85;
    }
}
