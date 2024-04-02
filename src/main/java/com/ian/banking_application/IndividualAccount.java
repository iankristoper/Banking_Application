package com.ian.banking_application;

/**
 *
 * @author Ian Tagano
 * 
 */
public class IndividualAccount extends Account
{
    //constructor for the individual account to initialize the account number
    public IndividualAccount(String accountNumber)
    {
        super(accountNumber);
    }
    
    @Override 
    public void withdraw(double amount)
    {
        //check if there is enough balane 
        if(amount <= balance)
        {
            balance = balance - amount;
            System.out.println("Withdrawal of $" + amount + " successful. Current balance: $" + balance);
        }
        else 
        {
            System.out.println("Insufficient funds. Withdrawal not allowed.");
        }
    }
        
}
