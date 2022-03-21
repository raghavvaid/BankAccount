package com.company;

public class SpecialCheckingAccount extends CheckingAccount{

    private double minBal;
    private double annualRate;

    public SpecialCheckingAccount(int idNumber, double startBal, double cc, double annualIntRate, double minimumBal){
        super(idNumber, startBal, cc);
        minBal = minimumBal;
        annualRate = annualIntRate;
    }

    public void clearCheck(double amount){
        if (currentBalance() >= minBal){
            decreaseBalance(amount);
        }
        else{
            super.clearCheck(amount);
        }
    }

    public double monthlyInterest(){
        if (currentBalance() > minBal){
            return currentBalance() * annualRate / 12;
        }
        else{
            return super.monthlyInterest();
        }
    }

}
