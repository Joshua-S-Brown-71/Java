// Program Name: LAB21A
// Name: Joshua Brown
// Purpose: Practice using eclipse

import java.util.*;
import java.io.*;

public class LAB21A 
{
	public static void main(String[] args) throws IOException 
	{
		File f1 = new File("Lab21A1.txt");
		Scanner s1 = new Scanner(f1);

		Set<String> set1 = new HashSet<>();

		while(s1.hasNext())
		{
			set1.add(s1.nextLine());
		}
		s1.close();
		TreeSet<String> tSet1 = new TreeSet<>(set1);


		File f2 = new File("Lab21A2.txt");
		Scanner s2 = new Scanner(f2);

		Set<String> set2 = new HashSet<>();

		while(s2.hasNext())
		{
			set2.add(s2.nextLine());
		}
		s2.close();
		TreeSet<String> tSet2 = new TreeSet<>(set2);


		File f3 = new File("Lab21A3.txt");
		Scanner s3 = new Scanner(f3);

		Set<String> set3 = new HashSet<>();

		while(s3.hasNext())
		{
			set3.add(s3.nextLine());
		}
		s3.close();
		TreeSet<String> tSet3 = new TreeSet<>(set3);

		listChecker(tSet1,tSet2);
		listChecker(tSet1,tSet3);

	}

	public static void listChecker(TreeSet<String> groceryList, TreeSet<String> recipe)
	{

		if (groceryList.containsAll(recipe))
		{
			System.out.println("\nThe dish was made. \nThe recipe is: "+recipe);
			groceryList.removeAll(recipe);
			System.out.println("\nThe remaining grocery list is: "+groceryList+"\n");
		}
		else
		{
			recipe.removeAll(groceryList);
			System.out.println("\nYou can't make this recipe. You are missing: \n"+recipe);
		}
		
	}

}
