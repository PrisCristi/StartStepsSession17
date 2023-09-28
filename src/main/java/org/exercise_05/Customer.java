package org.exercise_05;

public class Customer {
    private String name;
    private Account account;

    public Customer(String name){
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public String getName() {
        return name;
    }

    public void openAccount(Account account) {
        this.account = account;
    }

    public void openAccount(long accountNumber, double balance){
        this.account = new Account(accountNumber, balance);
    }

    public void closeAccount(){
        this.account = null;
    }
}
