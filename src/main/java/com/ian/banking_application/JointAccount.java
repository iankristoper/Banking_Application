package com.ian.banking_application;

/**
 *
 * @author Ian Tagano
 */

public class JointAccount extends Account
{
    //constructor for the joint account to initializw account number 
    public JointAccount(String accountNumber)
    {
        super(accountNumber);
    }
    
    
    @Override
    public void withdraw(double amount) 
    {
        //check if there is enough balance 
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful. Current balance: $" + balance);
        } 
        else 
        {
            System.out.println("Insufficient funds. Withdrawal not allowed.");
        }
    }
}
