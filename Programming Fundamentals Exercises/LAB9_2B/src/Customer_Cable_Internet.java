//Creates and keeps track of Customer_Cable_Internet info

import java.util.*;
import java.io.*;

public class Customer_Cable_Internet extends Customer
{
	protected String speed;

	
	public Customer_Cable_Internet(String inName, String inNumber, String inPlan, String inSpeed)
	{
		super(inName,inNumber,inPlan);

		speed=inSpeed;

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

		if(speed.equals("High"))
		{
			bill+=60.00;
		}
		else if(speed.equals("Regular"))
		{
			bill+=40.00;
		}
	}

	@Override
	public String toString()
	{
		return("This is a cable and internet customer\nThe name is: "+cName+"\nThe number is: "+cNumber+"\nThe plan is: "+cPlan+"\nThe speed is: "+speed+"\nThe bill is: "+String.format("%.2f\n", bill));
	}


	
}
