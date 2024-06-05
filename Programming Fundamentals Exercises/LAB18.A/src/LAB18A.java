// Program Name: LAB18A
// Name: Joshua Brown
// Purpose: Practice using eclipse

import java.util.*;
import java.io.*;

public class LAB18A 
{
	

	public static void main(String[] args) 
	{
		String x="";
		char[] xarrc;
		int[] xarri;	
		boolean dCheck=true;
		int sum=0, c=0;

		x=getDigits(x);
		xarrc=x.toCharArray();
		System.out.println("\nThe array is: "+Arrays.toString(xarrc));

		do 
		{
			dCheck=digitCheck(xarrc);

			if(dCheck==false)
			{
				x=getDigits(x);
				xarrc=x.toCharArray();
				System.out.println("\nThe array is: "+Arrays.toString(xarrc));
			}
			
			
		}while(dCheck!=true);


		xarri=new int[xarrc.length];

		for(int i=0;i<xarrc.length;i++)
		{
			xarri[i]=Character.getNumericValue(xarrc[i]);
		}

		digitSum(xarri,sum,c);	
	}

	public static String getDigits(String inX)
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter an Integer\n");
		
		inX=keyboard.nextLine();
		inX=inX.trim();
		
		return inX;

	}

	public static Boolean digitCheck(char[] inXarrc)
	{	
		for(int i=0;i<inXarrc.length;i++)
		{
			if(!(Character.isDigit(inXarrc[i])))
			{			
				System.out.println("\nSomething looks wrong please enter only numbers\n");
				return(false);
			}	
		}
		return true;	
	}

	public static void digitSum(int[] inXarri, int inSum, int inC)
	{ 		
		if(inC>(inXarri.length-1))
		{
			System.out.println("\nSum of the even digits "+inSum +"\n");	
			return;		
		}

				
		if(inXarri[inC]==2)
		{
			inSum+=2;
		}
		else if(inXarri[inC]==4)
		{
			inSum+=4;
		}
		else if(inXarri[inC]==6)
		{
			inSum+=6;
		}
		else if(inXarri[inC]==8)
		{
			inSum+=8;
		}	

		inC++;
		digitSum(inXarri,inSum,inC);		
		
	} 	
}
