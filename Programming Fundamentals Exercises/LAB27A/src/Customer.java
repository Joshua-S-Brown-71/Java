//Creates and keeps track of Customer info

import java.util.*;
import java.io.*;

public class Customer 
{
	private int customerID;
	private String customerName;

	public Customer(int inCID, String inCN)
	{
		customerID=inCID;
		customerName=inCN;
	}

	public int getID()
	{
		return customerID;
	}

	public String toString()
	{
		return("Customer ID: "+customerID+"\nCustomer Name: "+customerName+"\n ");
	}


}
