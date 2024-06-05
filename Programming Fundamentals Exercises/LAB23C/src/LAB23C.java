∫// Program Name: LAB23C
// Name: Joshua Brown
// Purpose: Practice using eclipse

import java.util.*;
import java.io.*;

public class LAB23C 
{
	public static void main(String[] args) throws IOException 
	{
		Software[] arr=new Software[5];

		File f1 = new File("Lab23C.txt");
		Scanner s1 = new Scanner(f1);
		
		for(int j=0;j<arr.length&&s1.hasNext();j++)
		{
			arr[j]=new Software(s1.nextLine(),s1.nextDouble(),s1.nextInt());
			if(j<arr.length-1)
			{
				s1.nextLine();

			}
		}

		s1.close();

		sort1(arr);
		System.out.println("\nSort by price: ");
		for(Software s:arr)
		{
			System.out.println(s);
		}

		sort2(arr);
		System.out.println("\nSort by number of players: ");
		for(Software s:arr)
		{
			System.out.println(s);
		}
	}

	public static void sort1(Software[] inArr)
    {
	    boolean nextI=true;
    
    	for (int k=1;k<inArr.length && nextI;k++) 
    	{
    		nextI=false;

    		for (int i=0;i<inArr.length-k;i++) 
    		{
        		if (inArr[i].getPrice()>inArr[i+1].getPrice()) 
        		{
        			Software temp=inArr[i];
        			inArr[i]=inArr[i+1];
        			inArr[i+1]=temp;
        			nextI=true;
        		}
        	}          
        }
    }

	public static void sort2(Software[] inArr)
    {
	    boolean nextI=true;
    
    	for (int k=1;k<inArr.length && nextI;k++) 
    	{
    		nextI=false;

    		for (int i=0;i<inArr.length-k;i++) 
    		{
        		if (inArr[i].getNum()>inArr[i+1].getNum()) 
        		{
        			Software temp=inArr[i];
        			inArr[i]=inArr[i+1];
        			inArr[i+1]=temp;
        			nextI=true;
        		}
        	}          
        }
    }

}
