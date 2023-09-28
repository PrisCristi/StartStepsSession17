package org.exercise_05;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Customer> customers = new ArrayList<>();
    private List<Account> accounts = new ArrayList<>();

    public void addCustomer(Customer newCustomer){
        this.customers.add(newCustomer);
    }

    public void removeCustomer(Customer customer){
        this.customers.remove(customer);
    }

    public void createAccount(Account account){
        this.accounts.add(account);
    }

}
