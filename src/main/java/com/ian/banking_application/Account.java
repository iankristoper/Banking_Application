package com.ian.banking_application;

/**
 *
 * @author Ian Tagano
 */

public abstract class Account 
{
    //protected intance variables for the base class
    protected String accountNumber;
    protected double balance;
    
    //constructor for initializing the data 
    public Account(String accountNumber)
    {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }
    
    //getter method for getting the data of account number
    public String getAccountNumber()
    {
        return accountNumber;
    }
    
    //getter method for getting the balance
    public double getBalance()
    {
        return balance;
    }
    
    
    //method for depositing
    public void deposit(double amount)
    {
        balance = balance + amount;
        System.out.println("Deposit of $" + amount + " successful. Current balance: $" + balance);
    }
    
    
    //abstract methods for withdrawing 
    public abstract void withdraw(double amount);
}
