// Program Name: LAB22B
// Name: Joshua Brown
// Purpose: Practice using eclipse

import java.util.*;
import java.io.*;

public class LAB22B 
{
	public static void main(String[] args) 
	{
		String input;
		Scanner keyboard = new Scanner(System.in);

		System.out.println("\nPlease enter a string");
		input=keyboard.next();
		System.out.println("\n");

		System.out.println("\nLongest set of identical characers: "+m1(input));

		System.out.println("\nThe order of complexity is Linear Time (O(n)) because it is only exuecuted (cArr.length-1) times\n");
	}

	public static String m1(String inS)
	{
		String maxS="";
		char[] cArr=inS.toCharArray();

		for(int i=0;i<(cArr.length-1);i++)
		{
			String s=Character.toString(cArr[i]);
			int j=i;

			while(cArr[j]==cArr[j+1])
			{
				s+=Character.toString(cArr[j]);
				
				if(j<(cArr.length-2))
				{
					j++;
				}
				else if(j>=(cArr.length-2))
				{
					break;
				}
			}
			i=j;
			
			if(s.length()>1)
			{
				System.out.println("Set of two or more identicatl charatcters: "+s);
			}	

			if(s.length()>maxS.length())
			{
				maxS=s;
			}
		}

		return maxS;
	}
}

	
	

