package com.company;

public class SavingsAccount extends Account{

    private double interestRate;

    public SavingsAccount(int id, double balance, double interest){
        super(id, balance);
        interestRate = interest;
    }

    public double monthlyInterest(){
        return currentBalance() * interestRate / 12;
    }

    public void withdraw(double amount){
        if (currentBalance() >= amount) decreaseBalance(amount);
    }

}
