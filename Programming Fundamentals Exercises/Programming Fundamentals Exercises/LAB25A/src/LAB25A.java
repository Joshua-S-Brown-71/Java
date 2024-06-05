// Program Name: LAB25A
// Name: Joshua Brown
// Purpose: Practice using eclipse

import java.util.*;
import java.io.*;

public class LAB25A 
{
	public static void main(String[] args) throws IOException 
	{
		BinarySearchTreeA obj1=new BinarySearchTreeA();

		File f1 = new File("Lab25A.txt");
		Scanner s1 = new Scanner(f1);

		while(s1.hasNext())
		{
			obj1.insert(s1.nextInt());
		}
		s1.close();

		Scanner keyboard=new Scanner(System.in);

		obj1.inorder(obj1.root);

		System.out.println("\nPlease enter an integer");
		
		if(obj1.search(keyboard.nextInt()))
		{
			System.out.println("\nThe number is in the list");	
		}
		else
		{
			System.out.println("\nThe number is not in the list");	
		}	

		
	}
}
