//********************************************************************
//  Account Class
//
//  Represents a bank account with basic services such as deposit
//  and withdraw.
//********************************************************************

import java.text.NumberFormat;
import java.util.*;
import java.io.*;

public class Account 
{
	private NumberFormat fmt = NumberFormat.getCurrencyInstance();
   
   //* To Do - declare 4 private instance variables acctNumber(int), balance(double), name(String) & rate (double)
	private int acctNumber=0;
	private double balance, rate=0;
	private String name;

   //-----------------------------------------------------------------
   //  Constructor: Sets up the account by defining its owner, 
   //  account number, and initial balance.
   //-----------------------------------------------------------------   
      // *To Do - write a constructor that receives 3 parameters (inName, inAccount, inBalance) and intializes the instance variables with them
      //          (Make sure the parameters' data types match their corresponding instance variable's data type.)
      // *To Do - It should also set rate equal to .035  
	public Account(String inName, int inAccount, double inBalance)
	{
		name=inName;
		acctNumber=inAccount;
		balance=inBalance;
		rate=0.035;
	}


   //-----------------------------------------------------------------
   //  Constructor: Sets up the account by defining its owner, 
   //    account number,initial balance, and interest rate
   //-----------------------------------------------------------------   
      // *To Do - write a second constructor that receives 4 parameters (inName, inAccount, inBalance, inRate) and intializes the instance variables with them
      //          (Make sure the parameters' data types match their corresponding instance variable's data type.)
	public Account(String inName, int inAccount, double inBalance, double inRate)
	{
		name=inName;
		acctNumber=inAccount;
		balance=inBalance;
		rate=inRate;
	}


   //-----------------------------------------------------------------
   //  deposit method: Validates the transaction, then deposits the 
   //    specified amount into the account. Returns the new balance.
   //-----------------------------------------------------------------
      //* To Do - write a double method named deposit that receives a double variable (amount) as a parameter and
      //*         increase balance by the parameter
      //*         BUT use an if-else statement....
 
      //*         if amount is less than 0 then print an error message
      //*         otherwise increase the balance
      
      //* To Do - return the balance
	public double deposit(double amount)
	{
		if(amount<0)
		{
			System.out.println("Error: Unable to accept an amount less than 0\n");
		}
		else
		{
			balance+=amount;
		}	

		return balance;	
	}
   

   //-----------------------------------------------------------------
   //  withdraw method: Validates the transaction, then withdraws the 
   //    specified amount from the account. Returns the new balance.
   //-----------------------------------------------------------------
      //* To Do - write a double method named withdraw that receives a double variable (amount) as a parameter and
      //*         decrease balance by the parameter
      //*         BUT use an if-else statement....
      
      //*         if the amount is less than 0 then print an error message
      //*         else if the amount is greater than the balance print a message to inform the user
      //*         otherwise decrease the balance
      
      //* To Do - return the balance
	public double withdraw(double amount)
	{
		if(amount<0)
		{
			System.out.println("Error: Unable to accept an amount less than 0\n");
		}
		else if(amount>balance)
		{
			System.out.println("Error: Not enough funds to withdraw that amount\n");			
		}
		else
		{
			balance-=amount;
		}	

		return balance;	
	}
   

   //-----------------------------------------------------------------
   //  addInterest method: Adds interest to the account and returns 
   //    the new balance. (no parameters)
   //-----------------------------------------------------------------
   //* To Do - write a double method named addInterest that has no parameters
   //* To Do - set balance equal to itself * (1 + rate)
   //* To Do - return the balance
	public double addInterest()
	{
		balance*=(1+rate);

		return balance;
	}


   //-----------------------------------------------------------------
   //  addInterest method: Adds interest to the account and returns 
   //    the new balance.
   //-----------------------------------------------------------------
   //* To Do - write a second double addInterest method that receives a double parameter (inRate)
   //* To Do - set balance equal to itself * (1 + inRate)
   //* To Do - return the balance
	public double addInterest(double inRate)
	{
		balance*=(1+inRate);

		return balance;
	}  


   //-----------------------------------------------------------------
   //  getBalance method: Returns the current balance of the account.
   //-----------------------------------------------------------------
   //*To Do - write a double method named getBalance that returns the balance (no parameters)
	public double getBalance()
	{
		return balance;
	}


   //-----------------------------------------------------------------
   //  getAccountNumber method: Returns the account number.
   //-----------------------------------------------------------------
   //*To Do - write an int method named getAccountNumber that returns the account number (no parameters)
	public int getAccountNumber()
	{
		return acctNumber;
	}


   //-----------------------------------------------------------------
   //  toString method: Returns a description of the account as a string.
   //-----------------------------------------------------------------
   //*To Do - write a String method named toString (no parameters)  
   //*To Do - return a string containing all the instance variables with labels.  
   //*   This string will be actually printed back in the main method, so do NOT print anything in here.
   
   //* To Do - use String.format("$%,.2f", balance) in your string instead of just balance; that will format it as currency
	public String toString()
	{
		return("Name: "+name+"\nAccount Number: "+acctNumber+"\nRate: "+rate+String.format("\nBalance: %,.2f\n",balance));
	}
}
