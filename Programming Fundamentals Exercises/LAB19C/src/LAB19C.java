// Program Name: LAB19C
// Name: Joshua Brown
// Purpose: Practice using eclipse

import java.util.*;
import java.io.*;
public class LAB19C 
{
	public static void main(String[] args) 
	{
		Double[] dbl={22.0,44.0,55.0,77.0,11.0};
		String[] str = {"up","down","left","right","diagonal"};

		printList(dbl);
		System.out.println("\nThe largest item is: "+	getLargest(dbl));
		System.out.println("\nThe largest item index is: "+	getLargestIndex(dbl));

		printList(str);
		System.out.println("\nThe largest item is: "+	getLargest(str));
		System.out.println("\nThe largest item index is: "+	getLargestIndex(str));


	}

	public static <E> void printList (E [] arr)
	{
		System.out.print("\nThe array contains: ");

		for(int i=0;i<arr.length;i++)
		{
			if(i==(arr.length-1))
			{
				System.out.print(arr[i]);
			}
			else
			{
				System.out.print(arr[i]+" - ");
			}
		}
		System.out.println();
	}

	public static <E extends Comparable<E>> E getLargest(E [] arr)
	{
		E largestN=arr[0];

		for(int i=1;i<arr.length;i++)
		{
			if((arr[i].compareTo(largestN))>0)
			{
				largestN=arr[i];
			}
		}
		return largestN;
	}

	public static <E extends Comparable<E>> int getLargestIndex(E [] arr)
	{
		int largestI=0;

		for(int i=1;i<arr.length;i++)
		{
			if((arr[i].compareTo(arr[largestI]))>0)
			{
				largestI=i;
			}
		}
		return largestI;
	} 

}
