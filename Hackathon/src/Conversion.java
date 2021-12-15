public class Conversion {
    public double INRToUSD(double amount){
        return round(amount/76.06);
    }
    public double INRToEUR(double amount){
        return round(amount/85.72);
    }
    public double INRToAUD(double amount){
        return round(amount/54.12);
    }
    public double INRToSAR(double amount){
        return round(amount/20.27);
    }
    public double USDToINR(double amount){
        return round(amount*76.06);
    }
    public double USDToEUR(double amount){
        return round(amount*0.89);
    }
    public double USDToAUD(double amount){
        return round(amount*1.41);
    }
    public double USDToSAR(double amount){
        return round(amount*3.75);
    }
    public double EURToINR(double amount){
        return round(amount*85.72);
    }
    public double EURToUSD(double amount){
        return round(amount*1.13);
    }
    public double EURToAUD(double amount){
        return round(amount*1.58);
    }
    public double EURToSAR(double amount){
        return round(amount*4.23);
    }
    public double AUDToINR(double amount){
        return round(amount*54.12);
    }
    public double AUDToUSD(double amount){
        return round(amount*0.71);
    }
    public double AUDToEUR(double amount){
        return round(amount*0.63);
    }
    public double AUDToSAR(double amount){
        return round(amount*2.67);
    }
    public double SARToINR(double amount){
        return round(amount*20.27);
    }
    public double SARToUSD(double amount){
        return round(amount*0.27);
    }
    public double SARToEUR(double amount){
        return round(amount*0.24);
    }
    public double SARToAUD(double amount){
        return round(amount*0.37);
    }
    public double round(double value) {
        return (double) Math.round(value * 100) / 100;
    }
}
