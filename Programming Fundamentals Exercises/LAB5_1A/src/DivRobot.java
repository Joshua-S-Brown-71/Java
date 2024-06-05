//Creates and keeps track of DivRobot info

import java.util.*;
public class DivRobot 
{
	private int number, sum;
	private String rating;
		
	public DivRobot (int inNum)
	{
		number=inNum;
		sum=0;
	}
	
	public DivRobot()
	{
		number=0;
		sum=0;	
	}
	
	public void setNumber (int inNum)
	{
		number=inNum;
	}
	
	public void addDivisors()
	{
		int n;
		for(n=1;n<number;n++)
    {
      if(number%n==0)
      {
        sum+=n;
      }
    }
	}
	
	public void setRating()
	{
		addDivisors();

		if(number==sum)
		{
			rating="Perfect";
		}
		else if(number>sum)
		{
			rating="Deficient";
		}
		else if(number<sum)
		{
			rating="Abundant";
		}
		else
		{
			System.out.println("Broken");
		}
	}
	
	public String toString()
	{
		return("The number is:"+number+"\n\nThe sum is:"+sum+"\n\nThe Rating is:"+rating);
	}


}
