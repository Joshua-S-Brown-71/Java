// Program Name: LAB25B
// Name: Joshua Brown
// Purpose: Practice using eclipse

import java.util.*;
import java.io.*;

public class LAB25B 
{
	public static void main(String[] args) throws IOException 
	{
		BinarySearchTreeB obj1=new BinarySearchTreeB();

		File f1 = new File("Lab25B.txt");
		Scanner s1 = new Scanner(f1);

		while(s1.hasNext())
		{
			obj1.insert(s1.next());
		}
		s1.close();

		System.out.println("\nSize: "+obj1.getSize());

		Scanner keyboard=new Scanner(System.in);

		System.out.println("\n***** Inorder *****");
		obj1.inorder(obj1.root);

		System.out.println("\n***** Preorder *****");
		obj1.preorder(obj1.root);

		System.out.println("\n***** Postorder *****");
		obj1.postorder(obj1.root);



	}
}
