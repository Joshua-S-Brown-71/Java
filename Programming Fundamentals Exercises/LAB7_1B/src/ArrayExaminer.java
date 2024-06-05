//Creates and keeps track of ArrayExaminer info

import java.util.*;
import java.io.*;

public class ArrayExaminer 
{
	private String textFileName;
	private int[] numArray;
	private int largest, largestIndex;

	public ArrayExaminer(String inString)
	{
		numArray=new int[20];
		textFileName=inString;
		largest=0;
		largestIndex=0;
	}

	public void fillArray()throws IOException
	{
		File f = new File(textFileName);
		Scanner s = new Scanner(f);

		while (s.hasNext())
      	{
      		for(int i=0;i<numArray.length;i++)
      		{
      			numArray[i]=s.nextInt();
      		}
      	}

      	s.close();   

      	System.out.println(Arrays.toString(numArray));
	}

	public void findLargest()
	{
		for(int i=0;i<numArray.length;i++)
		{
			if(numArray[i]>largest)
			{
				largest=numArray[i];
				largestIndex=i;
			}
		}

		System.out.println("The largest number in the array is: "+largest);
	}

	public boolean goingUp()
	{
		for(int i=0;i<largestIndex;i++)
		{
			if(numArray[i]>numArray[i+1])
			{
				return false;
			}

		}
		return true;
	}

	public boolean goingDown()
	{

		for(int i=largestIndex;i<(numArray.length-1);i++)
		{
			if(numArray[i]<numArray[i+1])
			{
				return false;
			}

		}

		return true;
	}

	public void isPeak()
	{
		findLargest();
		if(goingUp() && goingDown())
		{
			System.out.println("The array has a peak\n");
		}
		else
		{
			System.out.println("The array does not have a peak\n");			
		}
	}

}
