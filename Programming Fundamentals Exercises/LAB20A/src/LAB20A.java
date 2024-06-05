// Program Name: LAB20A
// Name: Joshua Brown
// Purpose: Practice using eclipse

import java.util.*;
import java.io.*;

public class LAB20A 
{

	public static void main(String[] args) 
	{
		Random randomNumbers = new Random();
		ArrayList<Integer> aL1 = new ArrayList<>();
		for(int i=0;i<20;i++)
		{
			aL1.add(randomNumbers.nextInt(101));
		}
		m1(aL1);
		System.out.println("\nThe average is: "+m2(aL1));
		Collections.sort(aL1);
		System.out.println("\nThe original SORTED array list is: " + aL1+"\n");


	}
	public static void m1(ArrayList <Integer> inaL1)
	{
		ArrayList<Integer> list1 = (ArrayList<Integer>)(inaL1.clone());
		ArrayList<Integer> list2 = new ArrayList<Integer> (Arrays.asList(0,10,20,30,40,50,60,70,80,90,100));

		System.out.println("\nThe original array list is: " + inaL1);
		System.out.println("\nList 1 contains 45: "+list1.contains(45));
		list1.removeAll(list2);
		System.out.println("\nList 1 after List 2 has been removed " + list1);
	}
	public static int m2(ArrayList <Integer> inaL2)
	{
		int sum=0;
		Iterator<Integer> iterator = inaL2.iterator();
   		while (iterator.hasNext()) 
   		{
   			sum+=iterator.next();
   		}
   		return(sum/inaL2.size());

	}

}
