// Program Name: LAB19A
// Name: Joshua Brown
// Purpose: Practice using eclipse

import java.util.*;
import java.io.*;

public class LAB19A 
{
	public static void main(String[] args) throws IOException 
	{	
		ArrayList<String> arrl = new ArrayList<String>();

		File f = new File("Lab19A.txt");
		Scanner s = new Scanner(f);

		while(s.hasNext())
		{
			arrl.add(s.next());
		}
		s.close();

		System.out.println(arrl);
		arrayListPrinter(arrl);
		
	}

	public static void arrayListPrinter(ArrayList<String> inArrl) throws IOException
	{
		int num;

		Scanner keyboard = new Scanner(System.in);
		ArrayList<String> arrl2 = new ArrayList<String>();


		System.out.println("\nPlease enter a number greater than 0");

		num=keyboard.nextInt();

		while(!(num>0))
		{
			System.out.println("\nSomething looks wrong, please enter a number greater than 0");
			num=keyboard.nextInt();
		}

		for(int i=0;i<inArrl.size();i++)
		{
			if(inArrl.get(i).length()<num)
			{
				arrl2.add(inArrl.get(i));
			}
		}

		System.out.println("\nThe items with a length less than "+num+" are: "+arrl2);
		keyboard.close();		
	}

}
