package org.exercise_05;

public class Account {
    private long accountNumber;

    private double balance = 0;

    public Account(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        setBalance(balance);
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = (balance>0)?balance:0;
    }

    public void deposit(double amount){
        this.balance+=amount;
    }
    public void withdraw(double amount){
        if(amount>balance){
            System.out.println("Not enough money on your balance");
            return;
        }else {
            this.balance-=amount;
        }
    }
}
