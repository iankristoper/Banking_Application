
package com.ian.banking_application;

/**
 *
 * @author Ian Tagano
 */
public class CorporateAccount extends Account
{
    //constructor for corporate account to initialize account number 
    public CorporateAccount(String accountNumber) 
    {
        super(accountNumber);
    }

    
    //override wintdraw methods 
    @Override
    public void withdraw(double amount) 
    {
        //check if there is enough balance 
        if (amount <= balance) 
        {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful. Current balance: $" + balance);
        } 
        else 
        {
            System.out.println("Insufficient funds. Withdrawal not allowed.");
        }
    }
}
