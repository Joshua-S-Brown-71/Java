// Program Name: LAB22A
// Name: Joshua Brown
// Purpose: Practice using eclipse

import java.util.*;
import java.io.*;

public class LAB22A 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> aL1=new ArrayList<>();
		TreeSet<Integer> tSet1 = new TreeSet<>();
		m1(aL1,tSet1);
		System.out.println("The ArrayList is:\n "+aL1+"\n");
		System.out.println("The TreeSet is:\n"+tSet1+"\n");
		m2(aL1,tSet1);

	}

	public static void m1(ArrayList <Integer> inaL1, TreeSet<Integer> inTSet1)
	{
		Random randomNumbers = new Random();

		double startTime = System.nanoTime();

		for(int i=0;i<1000;i++)
		{
			inaL1.add(randomNumbers.nextInt(2001));
		}

		double endTime = System.nanoTime();
		System.out.println("Execution time to fill the ArrayList is: " + (endTime - startTime) + " nano seconds\n");

		startTime = System.nanoTime();		

		for(int i=0;i<1000;i++)
		{
			inTSet1.add(randomNumbers.nextInt(2001));
		}

		endTime = System.nanoTime();
		System.out.println("Execution time to fill the TreeSet is: " + (endTime - startTime) + " nano seconds\n");
	}

	public static void m2(ArrayList <Integer> inaL1, TreeSet<Integer> inTSet1)
	{
		int input;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Please enter a number between 1 and 2000");
		
		input=keyboard.nextInt();

		double startTime = System.nanoTime();

		if(inaL1.contains(input))
		{
			System.out.println("\nThe ArrayList contains the number: "+input);
		}
		else
		{
			System.out.println("\nThe ArrayList does not contain the number: "+input);			
		}
		
		double endTime = System.nanoTime();
		System.out.printf("\nExecution time to search the ArrayList is: %,.2f nano seconds\n", (endTime - startTime));


		startTime = System.nanoTime();		

		if(inTSet1.contains(input))
		{
			System.out.println("\nThe TreeSet contains the number: "+input);
		}
		else
		{
			System.out.println("\nThe TreeSet does not contain the number: "+input);			
		}

		endTime = System.nanoTime();
		System.out.printf("\nExecution time to search the TreeSet is: %,.2f nano seconds\n", (endTime - startTime));

	}

}
