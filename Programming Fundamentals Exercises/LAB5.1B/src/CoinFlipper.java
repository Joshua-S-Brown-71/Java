//Creates and keeps track of CoinFlipper info

import java.util.*;
public class CoinFlipper 
{
	private int headsCount, tailsCount;
	Random rN = new Random();


	public CoinFlipper()
	{
		headsCount=0;
		tailsCount=0;		
	}

	public int flipCoin()
	{
		return rN.nextInt(2);
	}
	public void countFlips()
	{
		int n,oc;
		for(n=1;n<101;n++)
	    {

	    	oc=flipCoin();

	    	if(oc==1)
	    	{
	    		headsCount+=1;
	    	}
	    	else if(oc==0)
	    	{
	    		tailsCount+=1;
	    	}
	    	else
	    	{
	    	  	System.out.println("broken");
	   		}
		}

	}
	public String toString()
	{
		return("The number of heads is:"+headsCount+"\nThe number of tails is:"+tailsCount+"\n");
	}
}
