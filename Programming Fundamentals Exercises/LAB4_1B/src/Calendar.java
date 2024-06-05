//Creates and keeps track of calendar info

import java.util.*;
public class Calendar 
{
	private int days,month,year;

	public Calendar(int inmonth, int inyear)
	{
		month=inmonth;
		year=inyear;
	}
	public String toString()
	{
		return("The month number is: "+month+"\n"+"The year is: "+year+"\n"+"The number of days is: "+days+"\n");
	}
	public void setDays()
	{
		
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
		{
		    days=31;
		}
		else if(month==4||month==6||month==9||month==11)
		{
		    days=30;
		}
		else if(month==2)
		{
			if(year%4==0)
		    {
		    	if(year%100==0&&year%400!=0)
		    	{
	  				days=28;		    		
		    	}
		    	else
		    	{
		    		days=29;
		    	}
	  		}
	   		else
    		{
	 			days=28;	
	 		}
	 	}
	 	else
	 	{
	 		System.out.println("Broken");
	 	}
	 	      		

		    
	}
}
