package CSC1009.wk08_lab;

public class CheckingAccount {
    private int accountNumber;
    private double accountBalance;

    public CheckingAccount(int accountNumber, double accountBalance){
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }
    public void deposit(double value){
        this.accountBalance = accountBalance + value;
    }
    public double withdraw(double value) throws InsufficientFundsException{
        if(accountBalance<value){
            throw new InsufficientFundsException(value - this.accountBalance);
        }
        return this.accountBalance = accountBalance - value;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public double getAccountBalance() {
        return accountBalance;
    }
    

    
}
