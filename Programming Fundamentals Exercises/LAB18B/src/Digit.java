//Creates and keeps track of Digit info

import java.util.*;
import java.io.*;

public class Digit 
{
	private int x;
	private int num;
	private ArrayList<Integer> arr = new ArrayList<Integer>();
	private int sum, c;
	private boolean acheck;

	public Digit(int innum)
	{
		num=innum;
		x=0;
		sum=0;
		c=0;
		acheck=true;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("\nEnter a list of integers for array "+num+" and when done enter -7777\n");
		
		while(x!=-7777)
		{
			x=keyboard.nextInt();
			if(x!=-7777)
			{
				arr.add(x);
			}
		}

		digitSum();
	}

	public void digitSum()
	{		
		if(c<(arr.size()-1) && acheck==true)
		{	
			if((arr.get(c)+5)==arr.get(c+1))
			{
				c++;
				digitSum();
			}
			else
			{
				acheck=false;		
				digitSum();
			}
		}
		else
		{
			System.out.println(toString());
		}
	}

	public String toString()
	{
		return("\nThe contents of the array "+num+" are "+ arr +"\nThe status of the array is "+ acheck);
	}

}
