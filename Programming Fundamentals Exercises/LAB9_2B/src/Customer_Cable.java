//Creates and keeps track of Customer_Cable info

import java.util.*;
import java.io.*;

public class Customer_Cable extends Customer
{


	public Customer_Cable(String inName, String inNumber, String inPlan)
	{
		super(inName,inNumber,inPlan);

		computeBill();
	}

	@Override
	public void computeBill()
	{
		switch (cPlan)
		{
			case "Basic":
				bill=75.00;
				break;
			case "Premium":
				bill=100.00;
				break;
			case "Platinum":
				bill=125.00;
				break;
		}
	}

	@Override
	public String toString()
	{
		return("This is a cable customer only\nThe name is: "+cName+"\nThe number is: "+cNumber+"\nThe plan is: "+cPlan+"\nThe bill is: "+String.format("%.2f\n", bill));
	}



}
