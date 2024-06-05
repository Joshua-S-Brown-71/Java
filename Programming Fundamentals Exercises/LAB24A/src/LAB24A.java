// Program Name: LAB24A
// Name: Joshua Brown
// Purpose: Practice using eclipse

import java.util.*;
import java.io.*;

public class LAB24A 
{

	public static void main(String[] args) throws IOException 
	{
		MyLinkedList obj1=new MyLinkedList();

		File f1 = new File("Lab24A.txt");
		Scanner s1 = new Scanner(f1);

		while(s1.hasNext())
		{
			obj1.addLast(s1.next());
		}
		s1.close();

		System.out.println(obj1);

		Scanner keyboard=new Scanner(System.in);

		System.out.println("\nPlease enter a name");

		if(obj1.check(keyboard.next()))
		{
			System.out.println("\nThe name is in the list");
		}
		else
		{

			System.out.println("\nThe name is not in the list");
		}
	}
}
