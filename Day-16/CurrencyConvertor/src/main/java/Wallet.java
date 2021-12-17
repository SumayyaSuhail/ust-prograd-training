public class Wallet {
    private double walletAmount;

    public void depositDollarAmountToWallet(double inputDollars){
        walletAmount=walletAmount+dollarToRupees(inputDollars);
    }
    public void depositRupeesAmountToWallet(double inputRupees){
        walletAmount=walletAmount+inputRupees;
    }
    public void withdrawRupeesAmountFromWallet(double inputRupees){
        walletAmount=walletAmount-inputRupees;
    }
    public void withdrawDollarAmountFromWallet(double inputDollars){
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
