// Program Name: LAB21C
// Name: Joshua Brown
// Purpose: Practice using eclipse

import java.util.*;
import java.io.*;

public class LAB21C 
{
	public static void main(String[] args) throws IOException 
	{
		String teamName;
		String input;
		int value;
		int score;
		int count=0;

		Scanner keyboard = new Scanner(System.in);
		File f1 = new File("Lab21C.txt");
		Scanner s1 = new Scanner(f1);

		TreeMap<String, Integer> tM1 = new TreeMap<>();


		while(s1.hasNext())
		{
			teamName=s1.nextLine().trim();
			value=s1.nextInt();
			s1.nextLine();
			tM1.put(teamName, value);
		}
		s1.close();

		System.out.println(tM1);

		System.out.println("\nPlease enter a team name to see if it is taken");
		input=keyboard.nextLine();
		if(tM1.containsKey(input))
		{
			System.out.println("That name is taken");
		}
		else 
		{
			System.out.println("That name is not taken");			
		}

		System.out.println("\nPlease enter a score");
		score=keyboard.nextInt();
		
		for(Integer i:tM1.values())
		{
			if(i>=score)
			{
				count++;
			}
		}
		System.out.println(count+" Teams have mad the score "+score+" or better");


	}

}
