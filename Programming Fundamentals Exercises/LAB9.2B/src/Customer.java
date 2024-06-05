//Creates and keeps track of Customer info

import java.util.*;
import java.io.*;

public abstract class Customer 
{
	protected String cName, cNumber, cPlan;
	protected double bill;

	public Customer(String inName, String inNumber, String inPlan)
	{
		cName=inName;
		cNumber=inNumber;
		cPlan=inPlan;
		bill=0;
	}

	public abstract void computeBill();
	
	public abstract String toString();
	


}
