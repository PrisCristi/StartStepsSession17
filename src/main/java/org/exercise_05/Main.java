package org.exercise_05;

public class Main {
    public static void main(String[] args) {
        Bank myBank = new Bank();
        Customer customer1 = new Customer("Natallia Kharchenko");
        myBank.addCustomer(customer1);
        customer1.openAccount(1234567890, 5000.0);
        System.out.println("Customer: " + customer1.getName() + " balance: " + customer1.getAccount().getBalance());
        Account myAccount = customer1.getAccount();
        myBank.createAccount(myAccount);
        myAccount.deposit(550.0);
        System.out.println("Customer: " + customer1.getName() + " balance: " + customer1.getAccount().getBalance());
        myAccount.withdraw(300.0);
        System.out.println("Customer: " + customer1.getName() + " balance: " + customer1.getAccount().getBalance());
    }
}
