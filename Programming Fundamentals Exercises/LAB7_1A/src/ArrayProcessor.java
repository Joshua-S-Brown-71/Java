//Creates and keeps track of ArrayProcessor info

import java.util.*;
import java.io.*;
import java.lang.System;
import java.lang.Math;

public class ArrayProcessor 
{
	//instance variables and constructors could be used, but are not really needed

	//getSum() will return the sum of the numbers from position start to position stop, not including stop
	public static int getSum(int[] numArray, int start, int stop)
	{	
		int total=0;

		for(int i=(start-1);i<(stop-1);i++)
		{
			total+=numArray[i];
		}	

		return total;
		
	}

	//getCount() will return number of times val is present in numArray
	public static int getCount(int[] numArray, int val)
	{
		
		int counter=0;

		for(int x:numArray)
		{
			if (x==val)
			{
				counter+=1;
			}
		}

		return counter;

	}
}
