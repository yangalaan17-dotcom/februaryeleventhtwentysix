public class BankAccount implements Measurable{
    private double balance = 0.0;

    public bankAccount(double bal){
        balance = bal;
    }
    
    public double getMeasure(){
        return balance;
    }
}
