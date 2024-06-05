//Creates and keeps track of Order info

import java.util.*;
import java.io.*;

enum brands {DrPepper, SevenUp, IBC, Welchs}

public class Order 
{
	private int DrPepperCases, SevenUpCases, IBCCases, WelchsCases;
	private double totalCost;

	public Order()
	{
		DrPepperCases=0;
		SevenUpCases=0;
		IBCCases=0;
		WelchsCases=0;
		totalCost=0.00;
	}

	public brands getEnumValue(char bn)
	{
		brands brand=null;

		switch(bn)
		{
			case 'D':	
			case 'd':
				brand=brands.DrPepper;
				break;
			case 'S':
			case 's':
				brand=brands.SevenUp;
				break;
			case 'I':	
			case 'i':
				brand=brands.IBC;				
				break;
			case 'W':	
			case 'w':
				brand=brands.Welchs;
				break;
			default:
				System.out.println("Broken");
				break;
		}
		return brand;
	}

	public void addNewOrder(brands soda, int numOrdered)
	{
		double cost=0.00;

		switch(soda)
		{
			case DrPepper:
				DrPepperCases+=numOrdered;
				cost=(numOrdered*5.00);
				totalCost+=cost;
				break;
			case SevenUp:
				SevenUpCases+=numOrdered;
				cost=(numOrdered*4.50);
				totalCost+=cost;
				break;
			case IBC:
				IBCCases+=numOrdered;
				cost=(numOrdered*4.00);
				totalCost+=cost;
				break;
			case Welchs:
				WelchsCases+=numOrdered;
				cost=(numOrdered*5.50);
				totalCost+=cost;
				break;
			default:
				System.out.println("Broken2");
				break;
		}
		System.out.println(String.format("%8s",soda)+"\t"+numOrdered+"\t"+String.format("%7.2f",cost));
	}

	public void readOrders()throws FileNotFoundException 
	{
		brands soda;
		int nbrCases;
		char sodaInitial;

		File mF = new File("Lab6_2A.txt");
		Scanner iF = new Scanner(mF); 

		while (iF.hasNext())
      	{
      		sodaInitial=iF.next().charAt(0);
      		nbrCases=iF.nextInt();
      		soda=getEnumValue(sodaInitial);
      		addNewOrder(soda, nbrCases);
      	}

      	iF.close();   

      	System.out.println();
	}

	public String toString()
	{
		return("Number of Dr.Pepper cases: "+DrPepperCases+"\nNumber of SevenUp cases: "+SevenUpCases+"\nNumber of IBC cases: "+IBCCases+"\nNumber of Welchs cases: "+WelchsCases+"\nTotal Cost: "+String.format("%.2f",totalCost)+"\n");
	}

}
