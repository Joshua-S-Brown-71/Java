// Program Name: LAB28A
// Name: Joshua Brown
// Purpose: Practice using eclipse

import java.util.*;
import java.io.*;

public class LAB28A
{

	public static void main(String[] args) throws IOException
	{
		int x=0;
		MyQueue<Couch> q1=new MyQueue<>();
		Couch[] arr=new Couch[10];

		File f1 = new File("Lab28Atxt.txt");
		Scanner s1 = new Scanner(f1);

		//read file and put into array
		while(s1.hasNext())
		{
			arr[x]=new Couch(s1.nextInt(),s1.nextInt(),s1.nextLine());
			x++;
		}
		s1.close();

		//print unsorted array
		System.out.println(Arrays.toString(arr)); 

		//call sort
		sort(arr);

		//add to queue
		for(int z=0;z<arr.length;z++)
		{
			q1.enqueue(arr[z]);
		}

		//print sorted queue
		System.out.println(q1);

	}

	public static Couch[] sort(Couch[] inArr)
	{
		System.out.println("\nInsertion Sort\n");

		//insertion sort 
		//array sorted by itemNum in Couch class
		for (int i = 1; i < inArr.length; i++) 
		{
	     	Couch currentElement = inArr[i];
	    	int k;
	    	for (k = i - 1; k >= 0 && inArr[k].itemNum > currentElement.itemNum; k--)
	    	{
	        	inArr[k + 1] = inArr[k];
	    	}

	    	inArr[k + 1] = currentElement;
    	}
			return inArr;
	}

}
