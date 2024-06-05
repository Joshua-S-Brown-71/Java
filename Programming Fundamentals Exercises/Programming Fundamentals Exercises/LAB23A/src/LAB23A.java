// Program Name: LAB23A
// Name: Joshua Brown
// Purpose: Practice using eclipse

import java.util.*;
import java.io.*;

public class LAB23A 
{
	public static void main(String[] args)
	{
		int[] arr1 = new int[200];
		int[] arr2 = new int[200];
		int[] arr3 = new int[200];

		fill(arr1);
		fill(arr2);
		fill(arr3);

		double startTime = System.nanoTime();
		sS(arr1);
		double endTime = System.nanoTime();
		System.out.printf("Execution time to sort array using selection sort:  %,.2f nano seconds\n", (endTime - startTime));


		startTime = System.nanoTime();
		bS(arr2);
		endTime = System.nanoTime();
		System.out.printf("Execution time to sort array using bubble sort:  %,.2f nano seconds\n", (endTime - startTime));

		startTime = System.nanoTime();
		mS(arr3);
		endTime = System.nanoTime();
		
		System.out.print("\nThe merge sort: ");
		for(int j:arr3)
		{
			System.out.print(j+" ");
		}
		System.out.println("\n");
		System.out.printf("Execution time to sort array using merge sort:  %,.2f nano seconds\n", (endTime - startTime));


	}

	public static void fill(int[] inArr1)
	{
		Random randomNumbers=new Random();

		for(int i=0;i<inArr1.length;i++)
		{
			inArr1[i]=randomNumbers.nextInt(501);
		}
	}

	public static void sS(int[] inArr2)
	{  
    	for (int i=0;i<(inArr2.length-1);i++) 
        { 
        	int min=inArr2[i];
    		int index=i;     

        	for(int j=(i+1);j<inArr2.length;j++) 
        	{
        		if (inArr2[j]<min) 
        		{
        			min=inArr2[j];
              		index=j;
           		}
        	}
   
        	if(index!=i) 
    		{
        		inArr2[index]=inArr2[i];
        		inArr2[i]=min;
        	}
       }

       System.out.print("\nThe selection sort: ");

       for(int k=0;k<inArr2.length;k++)
       {
       		System.out.print(inArr2[k]+" ");
       }

       System.out.println("\n");
    }

    public static void bS(int[] inArr3)
    {
	    boolean nextI=true;
    
    	for (int k=1;k<inArr3.length && nextI;k++) 
    	{
    		nextI=false;

    		for (int i=0;i<inArr3.length-k;i++) 
    		{
        		if (inArr3[i]>inArr3[i+1]) 
        		{
        			int temp=inArr3[i];
        			inArr3[i]=inArr3[i+1];
        			inArr3[i+1]=temp;
        			nextI=true;
        		}
        	}          
        }

       System.out.print("\nThe bubble sort: ");

       for(int k=0;k<inArr3.length;k++)
       {
       		System.out.print(inArr3[k]+" ");
       }

       System.out.println("\n");
    }

    public static void mS(int[] inArr4)
    {
    	if (inArr4.length>1) 
    	{
		    int[] half1=new int[inArr4.length/2];

		    System.arraycopy(inArr4, 0, half1, 0, (inArr4.length/2));

		    mS(half1);

		    int half2Length=inArr4.length-(inArr4.length/2);

		    int[] half2=new int[half2Length];

		    System.arraycopy(inArr4, (inArr4.length/2), half2, 0, half2Length);

		    mS(half2);

		    merge(half1, half2, inArr4);
    	}
    }

	public static void merge(int[] list1, int[] list2, int[] temp) 
	{
	    int l1I=0; 
	    int l2I=0; 
	    int tI=0; 

	    while (l1I<list1.length && l2I<list2.length) 
	    {
	    	if (list1[l1I]<list2[l2I])
	    	{
	        	temp[tI++]=list1[l1I++];
	        }
	      	else
	      	{
	        	temp[tI++]=list2[l2I++];
	        }
	    }

	    while (l1I<list1.length)
	    {
	      temp[tI++]=list1[l1I++];
	    }

	    while (l2I<list2.length)
	    {
	      temp[tI++]=list2[l2I++];
	    }
    }
 	
}
