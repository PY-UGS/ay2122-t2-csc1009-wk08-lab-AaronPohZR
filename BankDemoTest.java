package CSC1009.wk08_lab;

import java.util.Scanner;

public class BankDemoTest{
    public BankDemoTest(){
        double depositValue, withdrawValue, remainingAmount;
        
        Scanner input  = new Scanner(System.in);
        CheckingAccount account  = new CheckingAccount(123123, 0);
        System.out.print("Enter deposit amount: ");
        depositValue = input.nextDouble();
        account.deposit(depositValue);
        try{
            System.out.print("Enter Withdraw amount:");
            withdrawValue = input.nextDouble();
            remainingAmount = account.withdraw(withdrawValue);
            System.out.println("The balance after withdraw is: $"+ remainingAmount);
        } 
        catch(InsufficientFundsException e){
            System.out.println(e.getClass().getSimpleName()+": Sorry, but your account is short by: $" + e.getAmount());        
        }
    }
}
