//Creates and keeps track of MonthTemperatures info

import java.util.*;
import java.io.*;

public class MonthTemperatures 
{
	private ArrayList<Double> tempArray;
	private String textFileName;
	private int month,year;
	private double highest, lowest, average;

	public MonthTemperatures(String inString)
	{
		tempArray= new ArrayList<Double>();
		textFileName=inString;
		highest=0;
		average=0;
		lowest=999;
	}

	public void fillArray()throws IOException
	{
		File f = new File(textFileName);
		Scanner s = new Scanner(f);

		month=s.nextInt();
		year=s.nextInt();

		while (s.hasNext())
      	{
			tempArray.add(s.nextDouble());      		
      	}

      	s.close();  

      	System.out.println(tempArray+"\n");

      	findHighest();
      	findLowest();
      	computeAverage();

	}

	public void findHighest()
	{
		for(int i=0;i<tempArray.size();i++)
		{
			if(tempArray.get(i)>highest)
			{
				highest=tempArray.get(i);
			}
		}
	}

	public void findLowest()
	{
		for(int i=0;i<tempArray.size();i++)
		{
			if(tempArray.get(i)<lowest)
			{
				lowest=tempArray.get(i);
			}
		}
	}

	public void computeAverage()
	{
		double sum=0;

		for(int i=0;i<tempArray.size();i++)
		{
			sum+=tempArray.get(i);
		}

		average=sum/tempArray.size();
	}

	public String toString()
	{
		return("The month number is: "+month+"\nThe year is: "+year+"\nThe highest value is: "+highest+"\nThe lowest value is: "+lowest+"\nThe average is: "+String.format("%.2f",average)+"\n");
	}

}
