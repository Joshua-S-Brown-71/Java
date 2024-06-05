// Program Name: LAB18D
// Name: Joshua Brown
// Purpose: Practice using eclipse

import java.util.*;
import java.io.*;

public class LAB18D 
{
	

	public static void main(String[] args) 
	{
		int y=0;
		int n=2; 

		math(n);
		System.out.println("\n");
		math(4,4,5,6,y);
	}

	public static void math(int inN)
	{
		double total=0;

		if(inN>=2&&inN<=10)
		{
			total=((Math.pow(inN,2))/(inN-1));
			System.out.println("For n="+inN+" the equation n^2/(n-1)="+total+"\n");
			inN++;
			math(inN);
		}
	}

	public static void math(int... numbers)
	{	
		int z=0;
		z+=numbers[4];
		double total2=0;

		if(z<(numbers.length-1))
		{
			total2=((Math.pow(numbers[z],2))/(numbers[z]-1));
			System.out.println("For n="+numbers[z]+" the equation n^2/(n-1)="+total2+"\n");
			z+=1;
			math(4,4,5,6,z);		
		}		
	}

}
