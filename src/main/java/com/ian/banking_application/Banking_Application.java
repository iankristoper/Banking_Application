package com.ian.banking_application;

/**
 *
 * @author Ian Tagano
 */

public class Banking_Application 
{

    public static void main(String[] args) 
    {
        Account individual = new IndividualAccount("A1200");
        Account joint = new JointAccount("A1300");
        Account corporate = new CorporateAccount("A1400");
        
        individual.deposit(100000);
        individual.withdraw(1000);
        
        joint.deposit(2000);
        joint.withdraw(100);
        
        corporate.deposit(1000000);
        corporate.withdraw(20000);
    }
}
